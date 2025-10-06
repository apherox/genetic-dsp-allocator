package com.dsp.ga.domain.task;

import com.dsp.ga.domain.Technology;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public abstract class Task {

    protected int id;
    protected Technology technology;
    protected boolean nativeTask;

    public Task(int id, Technology technology, boolean nativeTask) {
        this.id = id;
        this.technology = technology;
        this.nativeTask = nativeTask;
    }
}
