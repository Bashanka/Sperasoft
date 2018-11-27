package minesweeper;

import java.util.ArrayList;
import java.util.Random;

public class Minesweeper {

    private int[][] board;
    private String[][] showBoard;
    private int bombs;
    private int safeCells;
    private boolean gameover = false;

    private static final int MIN_SIZE = 5;
    private static final int DEFAULT_MINES_NUMBER = 5;

    public Minesweeper() {
        setShowBoard(MIN_SIZE, MIN_SIZE);
        setBoard(MIN_SIZE, MIN_SIZE);
        setBombs(DEFAULT_MINES_NUMBER);
    }

    public Minesweeper(int x, int y) {
        setShowBoard(x, y);
        setBoard(x, y);
        setBombs(DEFAULT_MINES_NUMBER);
    }

    public Minesweeper(int x, int y, int n) {
        setShowBoard(x, y);
        setBoard(x, y);
        setBombs(n);
    }

    private void setShowBoard(int x, int y) {
        if (x >= MIN_SIZE && y >= MIN_SIZE) {
            showBoard = new String[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    showBoard[i][j] = "+";
                }
            }
        }
        else if (x >= MIN_SIZE) {
            showBoard = new String[x][MIN_SIZE];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < MIN_SIZE; j++) {
                    showBoard[i][j] = "+";
                }
            }
        }
        else if (y >= MIN_SIZE) {
            showBoard = new String[MIN_SIZE][y];
            for (int i = 0; i < MIN_SIZE; i++) {
                for (int j = 0; j < y; j++) {
                    showBoard[i][j] = "+";
                }
            }
        }
        else {
            showBoard = new String[MIN_SIZE][MIN_SIZE];
            for (int i = 0; i < MIN_SIZE; i++) {
                for (int j = 0; j < MIN_SIZE; j++) {
                    showBoard[i][j] = "+";
                }
            }
        }
    }

    private void setBoard(int x, int y) {
        if (x >= MIN_SIZE && y >= MIN_SIZE) {
            board = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    board[i][j] = 0;
                }
            }

        }
        else if (x >= MIN_SIZE) {
            board = new int[x][MIN_SIZE];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < MIN_SIZE; j++) {
                    board[i][j] = 0;
                }
            }
        }
        else if (y >= MIN_SIZE) {
            board = new int[MIN_SIZE][y];
            for (int i = 0; i < MIN_SIZE; i++) {
                for (int j = 0; j < y; j++) {
                    board[i][j] = 0;
                }
            }
        }
        else {
            board = new int[MIN_SIZE][MIN_SIZE];
            for (int i = 0; i < MIN_SIZE; i++) {
                for (int j = 0; j < MIN_SIZE; j++) {
                    board[i][j] = 0;
                }
            }
        }
    }

    private void setBombs(int n) {
        bombs = (board.length * board[0].length) > n ? n : DEFAULT_MINES_NUMBER;
        safeCells = board.length * board[0].length - bombs;
        // take array with x*y size with value from 0 to x*y-1 to generate bombs on board
        ArrayList<Integer> cells = new ArrayList<Integer>();
        for (int i = 0; i < board.length * board[0].length; i++) cells.add(i);
        Random r = new Random();
        for (int i = 0; i < bombs; i++) {
            // take random index and element from array to create bobm and delete this element from array
            int c = cells.remove(r.nextInt(cells.size()));
            setBomb(c / board[0].length, c % board[0].length);
        }
    }

    private void setBomb(int x, int y) {
        board[x][y] = 9; // 9 means bomb
        // increment all around cells
        if (x > 0) {
            if (y > 0 && board[x-1][y-1] != 9) board[x-1][y-1] += 1;
            if (board[x-1][y] != 9) board[x-1][y] += 1;
            if (y < board[0].length - 1 && board[x-1][y+1] != 9) board[x-1][y+1] += 1;
        }

        if (y > 0 && board[x][y-1] != 9) board[x][y-1] += 1;
        if (y < board[0].length - 1 && board[x][y+1] != 9) board[x][y+1] += 1;

        if (x < board.length - 1) {
            if (y > 0 && board[x+1][y-1] != 9) board[x+1][y-1] += 1;
            if (board[x+1][y] != 9) board[x+1][y] += 1;
            if (y < board[0].length - 1 && board[x+1][y+1] != 9) board[x+1][y+1] += 1;
        }
    }

    // debug. need delete. can show you real board
    public void drawBoard() {
        System.out.print("\t");
        for (int i = 0; i < board[0].length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int j = 0; j < board[0].length; j++) {
            System.out.print(j + "\t");

            for (int i = 0; i < board.length; i++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void drawShowBoard() {
        System.out.print("\t");
        for (int i = 0; i < showBoard[0].length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int j = 0; j < showBoard[0].length; j++) {
            System.out.print(j + "\t");

            for (int i = 0; i < showBoard.length; i++) {
                System.out.print(showBoard[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void cellChoice(int x, int y) {
        if (0 <= x && x < board.length && 0 <= y && y < board[0].length && showBoard[x][y].equals("+")) {
            if (board[x][y] == 9) {
                gameover = true;
                showBombs();
            } else if (board[x][y] == 0) {

                showBoard[x][y] = Integer.toString(board[x][y]);
                safeCells -= 1;
                if (safeCells == 0) fillBoard();

                cellChoice(x-1, y-1);
                cellChoice(x-1, y);
                cellChoice(x-1, y+1);
                cellChoice(x, y-1);
                cellChoice(x, y+1);
                cellChoice(x+1, y-1);
                cellChoice(x+1, y);
                cellChoice(x+1, y+1);
            } else {
                showBoard[x][y] = Integer.toString(board[x][y]);
                safeCells -= 1;
                if (safeCells == 0) fillBoard();
            }
        }
    }

    public void mineChoice(int x, int y) {
        if (0 <= x && x < board.length && 0 <= y && y < board.length && !showBoard[x][y].equals("*")) {
            showBoard[x][y] = "*";
        } else if (0 <= x && x < board.length && 0 <= y && y < board.length && showBoard[x][y].equals("*")) {
            showBoard[x][y] = "+";
        }
    }

    private void showBombs() {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (board[i][j] == 9) showBoard[i][j] = "*";
                else showBoard[i][j] = ".";
    }

    private void fillBoard() {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (board[i][j] == 9) showBoard[i][j] = "*";
                else showBoard[i][j] = Integer.toString(board[i][j]);
    }

    public boolean isGameover() {
        return gameover;
    }

    public boolean isWin() {
        return safeCells == 0;
    }

}
