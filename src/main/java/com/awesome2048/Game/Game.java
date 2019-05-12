package com.awesome2048.Game;

public class Game {
    private int currentScore;
    private Board board;

    public boolean isGameOver() {
        Board cloned = board.cloneBoard(); //So we don't affect the real board
        return cloned.isBoardFull() && !cloned.move(Direction.up) && !cloned.move(Direction.down) && !cloned.move(Direction.left) && !cloned.move(Direction.right);
    }
}
