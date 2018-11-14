package basicsobjects;

public class Position {
    private int x;
    private int y;

    Position() {
        setDefaultPosition();
    }

    Position(int x, int y) {
        setDefaultPosition();
        if (x > 0) this.x = x;
        if (y > 0) this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private void setDefaultPosition() {
        this.x = 0;
        this.y = 0;
    }

}
