package com.dsp.ga.domain;

import lombok.Getter;

@Getter
public enum Technology {

    TWO_G("2G"),
    THREE_G("3G"),
    FOUR_G("4G"),
    FIVE_G("5G");

    private final String value;

    Technology(String technology) {
        this.value = technology;
    }

}
