package inheritance.practice1;

public class Cylinder extends Circle {

    private double height;

    private static final double DEFAULT_HEIGHT = 10;

    public Cylinder() {
        super();
        this.height = DEFAULT_HEIGHT;

    }

    public Cylinder(double radius) {
        super(radius);
        this.height = DEFAULT_HEIGHT;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height > 0 ? height : DEFAULT_HEIGHT;
    }

    public Cylinder(double radius, double height, Colour colour) {
        super(radius, colour);
        this.height = height > 0 ? height : DEFAULT_HEIGHT;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : DEFAULT_HEIGHT;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * super.getRadius() * Math.PI * height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder with radius = " + getRadius() + ", height = " + this.height + " and colour = " + getColour();
    }
}
