package com.trustly.MontyHallSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MultipleSimulatorWhileNotChangingBox extends MultipleSimulator {
    public MultipleSimulatorWhileNotChangingBox(int timesOfSimulate) {
        super(timesOfSimulate);
    }

    @Override
    protected boolean singleSimulate() {
        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            boxes.add(new Box(i));
        }

        Random rand = new Random();
        boxes.get(rand.nextInt(3)).setHasMoney(true);

        Selector selector = new Selector(boxes);

        if (boxes.get(selector.getSelectedBoxID()).hasMoney())
            return true;
        return false;
    }
}
