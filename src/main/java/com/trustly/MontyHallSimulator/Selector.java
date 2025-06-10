package com.trustly.MontyHallSimulator;

import java.util.List;
import java.util.Random;

public class Selector {
    private int selectedBoxID;

    public Selector(List<Box> boxes) {
        Random rand = new Random();
        this.selectedBoxID = boxes.get(rand.nextInt(boxes.size())).getId();
    }

    public int getSelectedBoxID() {
        return selectedBoxID;
    }

    public void setSelectedBoxID(int id) {
        this.selectedBoxID = id;
    }

}
