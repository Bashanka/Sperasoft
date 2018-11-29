package inheritance.practice1;

public class Circle {

    private double radius;
    private Colour colour;

    private static final double DEFAULT_RADIUS = 5;
    private static final Colour DEFAULT_COLOUR = Colour.WHITE;


    public enum Colour {
        WHITE,
        BLACK,
        GREEN,
        BLUE,
        YELLOW,
        RED,
        PINK,
        PURPLE
    }

    public Circle() {
        this.radius = DEFAULT_RADIUS;
        this.colour = DEFAULT_COLOUR;
    }

    public Circle(double radius) {
        this.radius = radius > 0 ? radius : DEFAULT_RADIUS;
    }

    public Circle(double radius, Colour colour) {
        this.radius = radius > 0 ? radius : DEFAULT_RADIUS;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) this.radius = radius;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + this.radius + " and colour = " + this.colour;
    }

}
