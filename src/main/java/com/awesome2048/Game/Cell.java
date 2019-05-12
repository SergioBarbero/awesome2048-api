package com.awesome2048.Game;

public class Cell {
    private Tile tile;

    public Cell(Tile tile) {
        this.tile = tile;
    }

    public boolean hasTile() {
        return tile != null;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }
}
