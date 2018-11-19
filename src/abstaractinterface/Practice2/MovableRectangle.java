package abstaractinterface.Practice2;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    private int xSpeed;
    private int ySpeed;

    private static final int DEFAULT_X_SPEED = 0;
    private static final int DEFAULT_Y_SPEED = 0;

    public MovableRectangle() {
        setTopLeft(new MovablePoint());
        setBottomRight(new MovablePoint());
        setXSpeed(DEFAULT_X_SPEED);
        setYSpeed(DEFAULT_Y_SPEED);
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        setTopLeft(topLeft);
        setBottomRight(bottomRight);
        setXSpeed(DEFAULT_X_SPEED);
        setYSpeed(DEFAULT_Y_SPEED);
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight, int xSpeed, int ySpeed) {
        setTopLeft(topLeft);
        setBottomRight(bottomRight);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed > 0 ? xSpeed : DEFAULT_X_SPEED;
        topLeft.setXSpeed(this.xSpeed);
        bottomRight.setXSpeed(this.xSpeed);
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed > 0 ? ySpeed : DEFAULT_Y_SPEED;
        topLeft.setYSpeed(this.ySpeed);
        bottomRight.setYSpeed(this.ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }


    @Override
    public String toString() {
        return "This is a MovableRectangle object with topLeft " + topLeft.toString() + " and bottomRight " + bottomRight.toString();
    }

}
