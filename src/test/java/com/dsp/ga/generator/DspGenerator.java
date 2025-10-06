package com.dsp.ga.generator;

import com.dsp.ga.domain.Dsp;
import com.dsp.ga.domain.Technology;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DspGenerator {

    public static Set<Dsp> generate4Dsps() {
        Set<Dsp> dsps = new HashSet<>(4);
        dsps.add(Dsp.builder()
                .id(1)
                .ipAddress("192.168.10.1")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G))).build());
        dsps.add(Dsp.builder()
                .id(2)
                .ipAddress("192.168.10.2")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(3)
                .ipAddress("192.168.10.3")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G, Technology.FIVE_G))).build());

        dsps.add(Dsp.builder()
                .id(4)
                .ipAddress("192.168.10.4")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G, Technology.FOUR_G, Technology.FIVE_G))).build());

        return dsps;
    }

    public static Set<Dsp> generate8Dsps() {
        Set<Dsp> dsps = new HashSet<>(8);
        dsps.add(Dsp.builder()
                .id(1)
                .ipAddress("192.168.10.1")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G))).build());
        dsps.add(Dsp.builder()
                .id(2)
                .ipAddress("192.168.10.2")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G))).build());

        dsps.add(Dsp.builder()
                .id(3)
                .ipAddress("192.168.10.3")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(4)
                .ipAddress("192.168.10.4")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(5)
                .ipAddress("192.168.10.5")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(6)
                .ipAddress("192.168.10.6")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(7)
                .ipAddress("192.168.10.7")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G, Technology.FOUR_G, Technology.FIVE_G))).build());

        dsps.add(Dsp.builder()
                .id(8)
                .ipAddress("192.168.10.8")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G, Technology.FOUR_G))).build());
        return dsps;
    }

    public static Set<Dsp> generate16Dsps() {
        Set<Dsp> dsps = new HashSet<>(16);
        dsps.add(Dsp.builder()
                .id(1)
                .ipAddress("192.168.10.1")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G))).build());
        dsps.add(Dsp.builder()
                .id(2)
                .ipAddress("192.168.10.2")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G))).build());

        dsps.add(Dsp.builder()
                .id(3)
                .ipAddress("192.168.10.3")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(4)
                .ipAddress("192.168.10.4")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(5)
                .ipAddress("192.168.10.5")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(6)
                .ipAddress("192.168.10.6")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(7)
                .ipAddress("192.168.10.7")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(8)
                .ipAddress("192.168.10.4")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(9)
                .ipAddress("192.168.10.9")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());
        dsps.add(Dsp.builder()
                .id(10)
                .ipAddress("192.168.10.10")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(11)
                .ipAddress("192.168.10.11")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(12)
                .ipAddress("192.168.10.12")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(13)
                .ipAddress("192.168.10.13")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(14)
                .ipAddress("192.168.10.14")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(15)
                .ipAddress("192.168.10.15")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(16)
                .ipAddress("192.168.10.16")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G, Technology.FOUR_G))).build());
        return dsps;
    }

    public static Set<Dsp> generate32Dsps() {
        Set<Dsp> dsps = new HashSet<>(32);
        dsps.add(Dsp.builder()
                .id(1)
                .ipAddress("192.168.10.1")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G))).build());
        dsps.add(Dsp.builder()
                .id(2)
                .ipAddress("192.168.10.2")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G))).build());

        dsps.add(Dsp.builder()
                .id(3)
                .ipAddress("192.168.10.3")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G))).build());

        dsps.add(Dsp.builder()
                .id(4)
                .ipAddress("192.168.10.4")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G))).build());

        dsps.add(Dsp.builder()
                .id(5)
                .ipAddress("192.168.10.5")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(6)
                .ipAddress("192.168.10.6")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(7)
                .ipAddress("192.168.10.7")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(8)
                .ipAddress("192.168.10.4")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(9)
                .ipAddress("192.168.10.9")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());
        dsps.add(Dsp.builder()
                .id(10)
                .ipAddress("192.168.10.10")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(11)
                .ipAddress("192.168.10.11")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(12)
                .ipAddress("192.168.10.12")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G))).build());

        dsps.add(Dsp.builder()
                .id(13)
                .ipAddress("192.168.10.13")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(14)
                .ipAddress("192.168.10.14")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(15)
                .ipAddress("192.168.10.15")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(16)
                .ipAddress("192.168.10.16")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(17)
                .ipAddress("192.168.10.17")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());
        dsps.add(Dsp.builder()
                .id(18)
                .ipAddress("192.168.10.18")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(19)
                .ipAddress("192.168.10.19")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(20)
                .ipAddress("192.168.10.20")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(21)
                .ipAddress("192.168.10.21")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(22)
                .ipAddress("192.168.10.22")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(23)
                .ipAddress("192.168.10.23")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(24)
                .ipAddress("192.168.10.24")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(25)
                .ipAddress("192.168.10.25")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());
        dsps.add(Dsp.builder()
                .id(26)
                .ipAddress("192.168.10.26")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(27)
                .ipAddress("192.168.10.27")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(28)
                .ipAddress("192.168.10.28")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(29)
                .ipAddress("192.168.10.29")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(30)
                .ipAddress("192.168.10.30")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(31)
                .ipAddress("192.168.10.31")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G, Technology.FOUR_G))).build());

        dsps.add(Dsp.builder()
                .id(32)
                .ipAddress("192.168.10.32")
                .isNative(false)
                .technologies(new HashSet<>(Arrays.asList(Technology.TWO_G, Technology.THREE_G, Technology.FOUR_G))).build());
        return dsps;
    }
}
