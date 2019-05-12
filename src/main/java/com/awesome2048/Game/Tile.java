package com.awesome2048.Game;

import java.util.Random;

public class Tile {
    private int value;

    public Tile() {
        int[] possibleValues = {2, 4};
        int index = new Random().nextInt(possibleValues.length);
        this.value = possibleValues[index];
    }

    public void increase() {
        this.value = this.value * 2;
    }
}
