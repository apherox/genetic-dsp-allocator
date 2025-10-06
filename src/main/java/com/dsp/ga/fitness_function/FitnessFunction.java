package com.dsp.ga.fitness_function;

import com.dsp.ga.domain.Dsp;
import com.dsp.ga.domain.task.Task;

import java.util.Map;

public class FitnessFunction {

    public static final int ONE_MILLION = 1_000_000;

    public static int fitness(Map<? extends Task, ? extends Dsp> transmitDspMap) {
        return transmitDspMap.entrySet().stream()
                .map(FitnessFunction::getAllele)
                .reduce(0, Integer::sum);
    }

    private static int getAllele(Map.Entry<? extends Task, ? extends Dsp> entry) {
        Task task = entry.getKey();
        Dsp dsp = entry.getValue();

        if (!dsp.getTechnologies().contains(task.getTechnology())
                || (task.isNativeTask() != dsp.isNative())) {
            return ONE_MILLION;
        } else {
            return FitnessStrategy.evaluateFitness(dsp);
        }
    }
}
