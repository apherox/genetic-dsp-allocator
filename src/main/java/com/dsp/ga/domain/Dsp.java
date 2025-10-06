package com.dsp.ga.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Dsp {

    private int id;
    private Set<Technology> technologies;
    private boolean isNative;
    private String ipAddress;

}
