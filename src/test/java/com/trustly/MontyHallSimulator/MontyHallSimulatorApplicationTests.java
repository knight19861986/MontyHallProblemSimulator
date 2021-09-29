package com.trustly.MontyHallSimulator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MontyHallSimulatorApplicationTests {
    private static int timesOfSimulate;
    private static MultipleSimulator sim;

    @BeforeAll
    public static void beforeClass() {
        timesOfSimulate = 100;
    }

    @Test
    void testMultipleSimulatorWhileSingleSimulateAlwaysTrue() {
        sim = new MultipleSimulator(timesOfSimulate) {
            @Override
            protected boolean singleSimulate() {
                return true;
            }
        };
        Assertions.assertEquals(1, sim.probabilityOfSuccess);
    }

    @Test
    void testMultipleSimulatorWhileSingleSimulateAlwaysFalse() {
        sim = new MultipleSimulator(timesOfSimulate) {
            @Override
            protected boolean singleSimulate() {
                return false;
            }
        };
        Assertions.assertEquals(0, sim.probabilityOfSuccess);
    }

    @Test
    void testMultipleSimulatorWhileNotChangingBox() {
        sim = new MultipleSimulatorWhileNotChangingBox(timesOfSimulate);
        Assertions.assertTrue(sim.probabilityOfSuccess > 0 && sim.probabilityOfSuccess < 1);
    }

    @Test
    void testMultipleSimulatorWhileChangingBox() {
        sim = new MultipleSimulatorWhileChangingBox(timesOfSimulate);
        Assertions.assertTrue(sim.probabilityOfSuccess > 0 && sim.probabilityOfSuccess < 1);
    }
}
