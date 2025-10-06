package com.dsp.ga;

import com.dsp.ga.codec.MappingCodec;
import com.dsp.ga.domain.Dsp;
import com.dsp.ga.domain.task.Task;
import com.dsp.ga.fitness_function.FitnessFunction;
import io.jenetics.EnumGene;
import io.jenetics.Optimize;
import io.jenetics.engine.Codec;
import io.jenetics.engine.Engine;
import io.jenetics.engine.EvolutionResult;
import io.jenetics.engine.EvolutionStatistics;
import org.apache.commons.collections4.CollectionUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author apherox
 */
public class OptimalTaskToDspAllocator {

    public static Map<? extends Task, ? extends Dsp> allocateTasksToDsps(Set<Task> tasks, Set<Dsp> dsps) throws AllocationNotPossibleException {

        if (tasks.size() > dsps.size()) {
            throw new AllocationNotPossibleException("Allocation not possible, more tasks than Dsps");
        }

        Map<Task, Dsp> reducedDspTaskMap = reduceDspWithSingleTechnology(tasks, dsps);
        Set<Task> reducedTasks = Set.copyOf(CollectionUtils.disjunction(tasks, reducedDspTaskMap.keySet()));
        Set<Dsp> reducedDsps = Set.copyOf(CollectionUtils.disjunction(dsps, reducedDspTaskMap.values()));

        final Codec<Map<Task, Dsp>, EnumGene<Integer>> codec = MappingCodec.createCodec(reducedTasks, reducedDsps);

        Engine<EnumGene<Integer>, Integer> engine = Engine.builder(FitnessFunction::fitness, codec)
                .optimize(Optimize.MINIMUM)
                .build();

        // Create evolution statistics consumer
        final EvolutionStatistics<Integer, ?> statistics = EvolutionStatistics.ofNumber();

        final Map<Task, Dsp> bestMapping = codec.decode(
                engine.stream()
                        .limit(calculatePopulation(reducedDsps))
                        .peek(statistics)
                        .collect(EvolutionResult.toBestGenotype())
        );

        if (FitnessFunction.fitness(bestMapping) >= FitnessFunction.ONE_MILLION) {
            throw new AllocationNotPossibleException("Allocation is not possible due to unsupported technologies of some Dsps");
        }

        System.out.println(statistics);

        Stream<Map.Entry<Task, Dsp>> combined = Stream.concat(reducedDspTaskMap.entrySet().stream(), bestMapping.entrySet().stream());
        return combined.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static long calculatePopulation(Set<Dsp> dsps) {
        int dspCount = dsps.size();
        int power = (dspCount / 10) + 3;
        return (long) Math.pow(10, power);
    }

    private static Map<Task, Dsp> reduceDspWithSingleTechnology(Set<Task> tasks, Set<Dsp> dsps) {
        Map<Task, Dsp> singleTechnologyMap = new HashMap<>();

        for (Dsp dsp : dsps) {
            for (Task task : tasks) {
                if (dsp.getTechnologies().size() == 1) {
                    if (task.getTechnology() == dsp.getTechnologies().stream().findFirst().get() && task.isNativeTask() == dsp.isNative()) {
                        if (!singleTechnologyMap.keySet().contains(task)) {
                            singleTechnologyMap.put(task, dsp);
                            break;
                        }
                    }
                }
            }
        }
        return singleTechnologyMap;
    }

}
