package com.dsp.ga;

import com.dsp.ga.domain.Dsp;
import com.dsp.ga.domain.task.Task;
import com.dsp.ga.generator.DspGenerator;
import com.dsp.ga.generator.TaskGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

class OptimalTaskToDspAllocatorTest {

    @Test
    void testSuccessfulMappingOf4Tasks() throws AllocationNotPossibleException {
        Map<? extends Task, ? extends Dsp> result = OptimalTaskToDspAllocator.allocateTasksToDsps(TaskGenerator.generate4Tasks(), DspGenerator.generate4Dsps());
        assertEquals(4, result.size());
        assertCorrectTaskToTechnologyMappings(result);
        System.out.println(result);
    }

    @Test
    void testSuccessfulMappingOf8Tasks() throws AllocationNotPossibleException {
        Map<? extends Task, ? extends Dsp> result = OptimalTaskToDspAllocator.allocateTasksToDsps(TaskGenerator.generate8Tasks(), DspGenerator.generate8Dsps());
        assertEquals(8, result.size());
        assertCorrectTaskToTechnologyMappings(result);
        System.out.println(result);
    }

    @Test
    void testSuccessfulMappingOf16Tasks() throws AllocationNotPossibleException {
        Map<? extends Task, ? extends Dsp> result = OptimalTaskToDspAllocator.allocateTasksToDsps(TaskGenerator.generate16Tasks(), DspGenerator.generate16Dsps());
        assertEquals(16, result.size());
        assertCorrectTaskToTechnologyMappings(result);
        System.out.println(result);
    }

    @Test
    void testSuccessfulMappingOf32Tasks() throws AllocationNotPossibleException {
        Map<? extends Task, ? extends Dsp> result = OptimalTaskToDspAllocator.allocateTasksToDsps(TaskGenerator.generate32Tasks(), DspGenerator.generate32Dsps());
        assertEquals(32, result.size());
        assertCorrectTaskToTechnologyMappings(result);
        System.out.println(result);
    }

    private void assertCorrectTaskToTechnologyMappings(Map<? extends Task, ? extends Dsp> result) {
        result.forEach((task, dsp) -> assertTrue(dsp.getTechnologies().contains(task.getTechnology())));
    }
}
