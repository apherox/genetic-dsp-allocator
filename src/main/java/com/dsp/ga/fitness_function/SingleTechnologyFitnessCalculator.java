package com.dsp.ga.fitness_function;

import com.dsp.ga.domain.Technology;

import java.util.Set;

public class SingleTechnologyFitnessCalculator implements FitnessCalculator {

    @Override
    public int calculateFitness(Set<Technology> technologies) {
        assert technologies.size() == 1;
        // We don't care which technology it is, all of them have same weight
        return 0;
    }
}
