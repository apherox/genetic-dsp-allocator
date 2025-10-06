package com.dsp.ga.fitness_function;

import com.dsp.ga.domain.Technology;

import java.util.Set;

public class ThreeTechnologiesFitnessCalculator implements FitnessCalculator {

    @Override
    public int calculateFitness(Set<Technology> technologies) {

        assert technologies.size() == 3;

        if (technologies.contains(Technology.TWO_G) && technologies.contains(Technology.THREE_G) && technologies.contains(Technology.FOUR_G)) {
            return 30;
        } else if (technologies.contains(Technology.TWO_G) && technologies.contains(Technology.THREE_G) && technologies.contains(Technology.FIVE_G)) {
            return 32;
        } else if (technologies.contains(Technology.TWO_G) && technologies.contains(Technology.FOUR_G) && technologies.contains(Technology.FIVE_G)) {
            return 34;
        } else if (technologies.contains(Technology.THREE_G) && technologies.contains(Technology.FOUR_G) && technologies.contains(Technology.FIVE_G)) {
            return 36;
        }
        return 0;
    }
}
