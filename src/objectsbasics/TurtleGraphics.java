package basicsobjects;

public class TurtleGraphics {

    private char[][] board;
    private Position penPosition;
    private char cellChar = '.';
    private char coloredCellChar = 'o';
    private char penChar = 'x';
    private static final int DEFAULT_SIZE = 10;

    public enum Direction {
        UP,
        DOWN,
        RIGHT,
        LEFT
    }

    public TurtleGraphics() {
        setDefaultBoardSize();
        clearBoard();
    }

    public TurtleGraphics(int width) {
        if (width > 0) board = new char[width][width];
        else {
            setDefaultBoardSize();
            System.out.println("Not valid board size. The default size 10x10 was set");
        }
        clearBoard();
    }

    public TurtleGraphics(int width, int height) {
        if (width > 0 && height >0) board = new char[width][height];
        else if (width > 0) {
            board = new char[width][DEFAULT_SIZE];
            System.out.println("Not valid board size. The size " + width + "x" + DEFAULT_SIZE + " was set");
        } else if (height > 0) {
            board = new char[DEFAULT_SIZE][height];
            System.out.println("Not valid board size. The size " + DEFAULT_SIZE + "x" + height + " was set");
        } else {
            setDefaultBoardSize();
            System.out.println("Not valid board size. The size " + DEFAULT_SIZE + "x" + DEFAULT_SIZE + " was set");
        }
        clearBoard();
    }

    public Position getPenPosition() {
        return penPosition;
    }

    public void setPenPosition(Position penPosition) {
        try {
            board[this.penPosition.getX()][this.penPosition.getY()] = coloredCellChar;
        } catch (Exception e) {
            System.out.println("Pen position has benn set");
        }
        this.penPosition = penPosition;
        board[this.penPosition.getX()][this.penPosition.getY()] = penChar;
    }

    public char getCellChar() {
        return cellChar;
    }

    public void setCellChar(char cellChar) {
        this.cellChar = cellChar;
    }

    public char getColoredCellChar() {
        return coloredCellChar;
    }

    public void setColoredCellChar(char coloredCellChar) {
        this.coloredCellChar = coloredCellChar;
    }

    public char getPenChar() {
        return penChar;
    }

    public void setPenChar(char penChar) {
        this.penChar = penChar;
    }

    public void showBoard() {
        for (int j = 0; j < board[0].length; j++) {
            for (int i = 0; i < board.length; i++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void movePen (Direction dir, int length) {
        switch (dir) {
            case UP:
                movePenUp(length);
                break;
            case DOWN:
                movePenDown(length);
                break;
            case LEFT:
                movePenLeft(length);
                break;
            case RIGHT:
                movePenRight(length);
                break;
        }
    }

    public void movePenUp(int length) {
        int newY = (penPosition.getY() - length) < 0 ? 0 : penPosition.getY() - length;
        for (int j = penPosition.getY() - 1; j >= newY; j--) {
            setPenPosition(new Position(penPosition.getX(), j));
        }
    }

    public void movePenDown(int length) {
        int newY = (penPosition.getY() + length) < board[0].length ? (penPosition.getY() + length) : board[0].length - 1;
        for (int j = penPosition.getY() + 1; j <= newY; j++) {
            setPenPosition(new Position(penPosition.getX(), j));
        }
    }

    public void movePenLeft(int length) {
        int newX = (penPosition.getX() - length) < 0 ? 0 : penPosition.getX() - length;
        for (int i = penPosition.getX() - 1; i >= newX; i--) {
            setPenPosition(new Position(i, penPosition.getY()));
        }
    }

    public void movePenRight(int length) {
        int newX = (penPosition.getX() + length) < board.length ? penPosition.getX() + length : board.length - 1;
        for (int i = penPosition.getX() + 1; i <= newX; i++) {
            setPenPosition(new Position(i, penPosition.getY()));
        }
    }

    public void clearBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = cellChar;
            }
        }
        penPosition = null;
    }

    private void setDefaultBoardSize() {
        board = new char[DEFAULT_SIZE][DEFAULT_SIZE];
    }

}