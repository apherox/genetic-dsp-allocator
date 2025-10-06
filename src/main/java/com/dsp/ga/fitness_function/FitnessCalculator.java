package com.dsp.ga.fitness_function;

import com.dsp.ga.domain.Technology;

import java.util.Set;

@FunctionalInterface
public interface FitnessCalculator {
    int calculateFitness(Set<Technology> technologies);
}
