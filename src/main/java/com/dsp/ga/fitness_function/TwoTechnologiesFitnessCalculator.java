package com.dsp.ga.fitness_function;

import com.dsp.ga.domain.Technology;

import java.util.Set;

public class TwoTechnologiesFitnessCalculator implements FitnessCalculator {

    @Override
    public int calculateFitness(Set<Technology> technologies) {

        assert technologies.size() == 2;

        if (technologies.contains(Technology.TWO_G) && technologies.contains(Technology.THREE_G)) {
            return 10;
        } else if (technologies.contains(Technology.TWO_G) && technologies.contains(Technology.FOUR_G)) {
            return 12;
        } else if (technologies.contains(Technology.TWO_G) && technologies.contains(Technology.FIVE_G)) {
            return 14;
        } else if (technologies.contains(Technology.THREE_G) && technologies.contains(Technology.FOUR_G)) {
            return 16;
        } else if (technologies.contains(Technology.THREE_G) && technologies.contains(Technology.FIVE_G)) {
            return 18;
        } else if (technologies.contains(Technology.FOUR_G) && technologies.contains(Technology.FIVE_G)) {
            return 20;
        }
        return 0;
    }
}
