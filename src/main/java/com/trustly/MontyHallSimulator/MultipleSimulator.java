package com.trustly.MontyHallSimulator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

public abstract class MultipleSimulator {
    protected float probabilityOfSuccess;

    public MultipleSimulator(int timesOfSimulate) {
        int numOfSuccess = 0;
        for (int i = 0; i < timesOfSimulate; i++) {
            if (singleSimulate())
                numOfSuccess++;

        }
        probabilityOfSuccess = (float)numOfSuccess / timesOfSimulate;
    }

    abstract protected boolean singleSimulate();

    public float getProbabilityOfSuccess() {
        return probabilityOfSuccess;
    }

}
