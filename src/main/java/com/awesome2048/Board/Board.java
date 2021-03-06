package com.awesome2048.Board;

import com.awesome2048.Cell.Cell;
import com.awesome2048.Direction.Direction;
import com.awesome2048.Tile.Tile;

import java.util.Arrays;
import java.util.Random;

public class Board {

    private Cell[][] cells;

    public Board(int size) {
        this.cells = new Cell[size][size];
    }

    private Board(Board another) {
        this.cells = another.cells;
    }

    public Board cloneBoard() {
        return new Board(this);
    }

    public boolean isBoardFull() {
        return Arrays.stream(cells).flatMap(Arrays::stream).allMatch(Cell::hasTile);
    }

    public Cell[] getRow(int i) {
        return cells[i];
    }

    public Cell getCell(int i, int j) {
        return cells[i][j];
    }

    public int getSize() {
        return cells.length;
    }

    /**
     * Makes a move over the board
     * @param direction specified direction
     * @return if board has changed
     */
    public boolean move(Direction direction) {
        return false;
    }

    public void addNewTileToEmptyCell() {
        boolean set = false;
        while (!set) {
            int i = new Random().nextInt(cells.length);
            int j = new Random().nextInt(cells.length);
            if (!cells[i][j].hasTile()) {
                this.cells[i][j].setTile(new Tile());
                set = true;
            }
        }
    }
}
