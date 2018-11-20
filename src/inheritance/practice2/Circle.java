package inheritance.practice2;

public class Circle extends Shape{

    private double radius;

    private static final double DEFAULT_RADIUS = 1.0;

    public Circle() {
        super();
        radius = DEFAULT_RADIUS;
    }

    public Circle(double radius) {
        super();
        this.radius = radius > 0 ? radius : DEFAULT_RADIUS;
    }

    public Circle(double radius, Colour colour, boolean filled) {
        super(colour, filled);
        this.radius = radius > 0 ? radius : DEFAULT_RADIUS;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius > 0 ? radius : DEFAULT_RADIUS;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }

}
