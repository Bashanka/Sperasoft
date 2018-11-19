package abstaractinterface.Practice2;

public class DemoClass {

    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(new MovablePoint(2, 2), new MovablePoint(5, 3), 3, 1);
        System.out.println(movableRectangle.toString());
        System.out.println();
        movableRectangle.moveUp();
        System.out.println("Movable Rectangle move up");
        System.out.println(movableRectangle.toString());
        System.out.println();
        movableRectangle.moveDown();
        System.out.println("Movable Rectangle move down");
        System.out.println(movableRectangle.toString());
        System.out.println();
        movableRectangle.moveLeft();
        System.out.println("Movable Rectangle move left");
        System.out.println(movableRectangle.toString());
        System.out.println();
        movableRectangle.moveRight();
        System.out.println("Movable Rectangle move right");
        System.out.println(movableRectangle.toString());
    }

}
