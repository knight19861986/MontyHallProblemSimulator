package com.trustly.MontyHallSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleSimulatorWhileChangingBox extends MultipleSimulator {
    public MultipleSimulatorWhileChangingBox(int timesOfSimulate) {
        super(timesOfSimulate);
    }

    @Override
    protected boolean singleSimulate() {
        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            boxes.add(new Box(i));
        }

        Random rand = new Random();
        int boxIdHasMoney = rand.nextInt(3);
        boxes.get(boxIdHasMoney).setHasMoney(true);

        Selector selector = new Selector(boxes);
        int boxIdSelected = selector.getSelectedBoxID();

        if (boxIdHasMoney == boxIdSelected)
            return false;
        return true;
    }
}
