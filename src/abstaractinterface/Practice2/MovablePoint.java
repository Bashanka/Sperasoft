package abstaractinterface.Practice2;

public class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    private static final int DEFAULT_X = 0;
    private static final int DEFAULT_Y = 0;
    private static final int DEFAULT_X_SPEED = 0;
    private static final int DEFAULT_Y_SPEED = 0;

    public MovablePoint() {
        setX(DEFAULT_X);
        setY(DEFAULT_Y);
        setXSpeed(DEFAULT_X_SPEED);
        setYSpeed(DEFAULT_Y_SPEED);
    }

    public MovablePoint(int x, int y) {
        setX(x);
        setY(y);
        setXSpeed(DEFAULT_X_SPEED);
        setYSpeed(DEFAULT_Y_SPEED);
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        setX(x);
        setY(y);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed > 0 ? xSpeed : DEFAULT_X_SPEED;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed > 0 ? ySpeed : DEFAULT_Y_SPEED;
    }

    @Override
    public String toString() {
        return "This is a MovablePoint object with x=" + getX() + ", y=" + getY() + ", xSpeed=" + getXSpeed() + " and ySpeed= " + getYSpeed();
    }

    @Override
    public void moveUp() {
        setX(getX() + getXSpeed());
    }

    @Override
    public void moveDown() {
        setX(getX() - getXSpeed());
    }

    @Override
    public void moveLeft () {
        setY(getY() + getYSpeed());
    }

    @Override
    public void moveRight () {
        setY(getY() - getYSpeed());
    }

}
