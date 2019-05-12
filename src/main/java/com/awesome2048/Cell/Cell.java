package com.awesome2048.Cell;

import com.awesome2048.Tile.Tile;

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
