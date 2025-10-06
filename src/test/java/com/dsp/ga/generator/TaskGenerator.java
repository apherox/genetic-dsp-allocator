package com.dsp.ga.generator;

import com.dsp.ga.domain.Technology;
import com.dsp.ga.domain.task.Task;
import com.dsp.ga.domain.task.Transmit;

import java.util.Set;

public class TaskGenerator {

    public static Set<Task> generate2Tasks() {
        Task t1 = new Transmit(1, Technology.TWO_G, false);
        Task t2 = new Transmit(2, Technology.TWO_G, false);
        return Set.of(t1, t2);
    }

    public static Set<Task> generate4Tasks() {
        Task t1 = new Transmit(1, Technology.FOUR_G, false);
        Task t2 = new Transmit(2, Technology.FIVE_G, false);
        Task t3 = new Transmit(3, Technology.THREE_G, false);
        Task t4 = new Transmit(4, Technology.TWO_G, false);
        return Set.of(t1, t2, t3, t4);
    }

    public static Set<Task> generate8Tasks() {
        Task t1 = new Transmit(1, Technology.TWO_G, false);
        Task t2 = new Transmit(2, Technology.TWO_G, false);
        Task t3 = new Transmit(3, Technology.THREE_G, false);
        Task t4 = new Transmit(4, Technology.THREE_G, false);
        Task t5 = new Transmit(5, Technology.FOUR_G, false);
        Task t6 = new Transmit(6, Technology.FOUR_G, false);
        Task t7 = new Transmit(7, Technology.THREE_G, false);
        Task t8 = new Transmit(8, Technology.FIVE_G, false);
        return Set.of(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static Set<Task> generate10Tasks() {
        Task t1 = new Transmit(1, Technology.TWO_G, false);
        Task t2 = new Transmit(2, Technology.TWO_G, false);
        Task t3 = new Transmit(3, Technology.THREE_G, false);
        Task t4 = new Transmit(4, Technology.THREE_G, false);
        Task t7 = new Transmit(7, Technology.THREE_G, false);
        Task t9 = new Transmit(9, Technology.THREE_G, false);
        Task t10 = new Transmit(10, Technology.THREE_G, false);
        Task t5 = new Transmit(5, Technology.FOUR_G, false);
        Task t6 = new Transmit(6, Technology.FOUR_G, false);
        Task t8 = new Transmit(8, Technology.FOUR_G, false);
        return Set.of(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    public static Set<Task> generate16Tasks() {
        Task t1 = new Transmit(1, Technology.TWO_G, false);
        Task t2 = new Transmit(2, Technology.TWO_G, false);
        Task t3 = new Transmit(3, Technology.THREE_G, false);
        Task t4 = new Transmit(4, Technology.THREE_G, false);
        Task t5 = new Transmit(5, Technology.FOUR_G, false);
        Task t6 = new Transmit(6, Technology.FOUR_G, false);
        Task t7 = new Transmit(7, Technology.THREE_G, false);
        Task t8 = new Transmit(8, Technology.FOUR_G, false);
        Task t9 = new Transmit(9, Technology.THREE_G, false);
        Task t10 = new Transmit(10, Technology.THREE_G, false);
        Task t11 = new Transmit(11, Technology.THREE_G, false);
        Task t12 = new Transmit(12, Technology.THREE_G, false);
        Task t13 = new Transmit(13, Technology.FOUR_G, false);
        Task t14 = new Transmit(14, Technology.FOUR_G, false);
        Task t15 = new Transmit(15, Technology.THREE_G, false);
        Task t16 = new Transmit(16, Technology.FOUR_G, false);
        return Set.of(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16);
    }

    public static Set<Task> generate32Tasks() {
        Task t1 = new Transmit(1, Technology.TWO_G, false);
        Task t2 = new Transmit(2, Technology.TWO_G, false);
        Task t3 = new Transmit(3, Technology.TWO_G, false);
        Task t4 = new Transmit(4, Technology.TWO_G, false);
        Task t5 = new Transmit(5, Technology.THREE_G, false);
        Task t6 = new Transmit(6, Technology.THREE_G, false);
        Task t7 = new Transmit(7, Technology.THREE_G, false);
        Task t8 = new Transmit(8, Technology.THREE_G, false);
        Task t9 = new Transmit(9, Technology.THREE_G, false);
        Task t10 = new Transmit(10, Technology.THREE_G, false);
        Task t11 = new Transmit(11, Technology.THREE_G, false);
        Task t12 = new Transmit(12, Technology.THREE_G, false);
        Task t13 = new Transmit(13, Technology.FOUR_G, false);
        Task t14 = new Transmit(14, Technology.FOUR_G, false);
        Task t15 = new Transmit(15, Technology.FOUR_G, false);
        Task t16 = new Transmit(16, Technology.FOUR_G, false);
        Task t17 = new Transmit(17, Technology.FOUR_G, false);
        Task t18 = new Transmit(18, Technology.FOUR_G, false);
        Task t19 = new Transmit(19, Technology.FOUR_G, false);
        Task t20 = new Transmit(20, Technology.FOUR_G, false);
        Task t21 = new Transmit(21, Technology.THREE_G, false);
        Task t22 = new Transmit(22, Technology.THREE_G, false);
        Task t23 = new Transmit(23, Technology.THREE_G, false);
        Task t24 = new Transmit(24, Technology.THREE_G, false);
        Task t25 = new Transmit(25, Technology.THREE_G, false);
        Task t26 = new Transmit(26, Technology.FOUR_G, false);
        Task t27 = new Transmit(27, Technology.FOUR_G, false);
        Task t28 = new Transmit(28, Technology.FOUR_G, false);
        Task t29 = new Transmit(29, Technology.FOUR_G, false);
        Task t30 = new Transmit(30, Technology.FOUR_G, false);
        Task t31 = new Transmit(31, Technology.FOUR_G, false);
        Task t32 = new Transmit(32, Technology.FOUR_G, false);

        return Set.of(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24,
                t25, t26, t27, t28, t29, t30, t31, t32);
    }

}
