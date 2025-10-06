package com.dsp.ga.domain.task;

import com.dsp.ga.domain.Technology;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class Transmit extends Task {

    public Transmit(int id, Technology technology, boolean nativeTask) {
        super(id, technology, nativeTask);
    }
}
