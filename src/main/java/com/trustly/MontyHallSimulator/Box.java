package com.trustly.MontyHallSimulator;

public class Box {
    private final int id;
    private boolean hasMoney;

    public Box(int id) {
        this.id = id;
        this.hasMoney = false;
    }

    public int getId() {
        return id;
    }

    public boolean hasMoney() {
        return hasMoney;
    }

    public void setHasMoney(boolean hasMoney) {
        this.hasMoney = hasMoney;
    }
}
