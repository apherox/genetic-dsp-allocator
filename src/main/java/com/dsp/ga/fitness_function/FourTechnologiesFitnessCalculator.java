package com.dsp.ga.fitness_function;

import com.dsp.ga.domain.Technology;

import java.util.Set;


public class FourTechnologiesFitnessCalculator implements FitnessCalculator {

    @Override
    public int calculateFitness(Set<Technology> technologies) {

        assert technologies.size() == 4;

        if (technologies.contains(Technology.TWO_G) && technologies.contains(Technology.THREE_G)
                && technologies.contains(Technology.FOUR_G) && technologies.contains(Technology.FIVE_G)) {
            return 50;
        }
        return 0;
    }
}
