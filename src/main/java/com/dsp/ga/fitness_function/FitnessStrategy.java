package com.dsp.ga.fitness_function;

import com.dsp.ga.domain.Dsp;
import com.dsp.ga.domain.Technology;

import java.util.Set;

public class FitnessStrategy {

    public static int evaluateFitness(Dsp dsp) {
        Set<Technology> technologies = dsp.getTechnologies();

        assert !technologies.isEmpty();

        if (technologies.size() == 1) {
            return new SingleTechnologyFitnessCalculator().calculateFitness(technologies);
        } else if (technologies.size() == 2) {
            return new TwoTechnologiesFitnessCalculator().calculateFitness(technologies);
        } else if (technologies.size() == 3) {
            return new ThreeTechnologiesFitnessCalculator().calculateFitness(technologies);
        } else if (technologies.size() == 4) {
            return new FourTechnologiesFitnessCalculator().calculateFitness(technologies);
        } else {
            throw new UnsupportedOperationException("Number of technologies is not supported");
        }
    }
}
