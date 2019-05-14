package com.awesome2048.Tile;

import java.util.Random;

public class Tile {
    private int value;

    public Tile() {
        int[] possibleValues = {2, 4};
        int index = new Random().nextInt(possibleValues.length);
        this.value = possibleValues[index];
    }

    public Tile(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increase() {
        this.value *= 2;
    }
}
