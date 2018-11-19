package abstaractinterface.Practice1;

abstract class Shape {

    private Colour colour;
    private boolean filled;

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

    public Shape() {
        this.colour = Colour.GREEN;
        this.filled = true;
    }

    public Shape(Colour colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "An abstract Shape with colour of " + colour + " and " + (filled ? "filled" : "Not filled");
    }

    public abstract double getArea ();

    public abstract double getPerimeter ();

    public abstract boolean isInside(double x, double y);

}
