package com.dsp.ga.codec;

import com.dsp.ga.domain.Dsp;
import com.dsp.ga.domain.task.Task;
import io.jenetics.EnumGene;
import io.jenetics.engine.Codec;
import io.jenetics.engine.Codecs;
import io.jenetics.util.ISeq;

import java.util.Map;
import java.util.Set;

public class MappingCodec {

    public static Codec<Map<Task, Dsp>, EnumGene<Integer>> createCodec(Set<Task> tasks, Set<Dsp> dsps) {

        Task[] t = new Task[tasks.size()];
        Dsp[] d = new Dsp[dsps.size()];

        final ISeq<? extends Task> transmitSeq = ISeq.of(tasks.toArray(t));
        final ISeq<? extends Dsp> dspSeq = ISeq.of(dsps.toArray(d));

        return Codecs.ofMapping(transmitSeq, dspSeq);
    }

}
