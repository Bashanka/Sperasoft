package abstaractinterface.Practice1;


public class Rectangle extends Shape {

    private double width;
    private double length;

    private static final double DEFAULT_SIZE = 1.0;

    public Rectangle() {
        super();
        width = DEFAULT_SIZE;
        length = DEFAULT_SIZE;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width > 0 ? width : DEFAULT_SIZE;
        this.length = length > 0 ? length : DEFAULT_SIZE;
    }

    public Rectangle(double width, double length, Colour colour, boolean filled) {
        super(colour, filled);
        this.width = width > 0 ? width : DEFAULT_SIZE;
        this.length = length > 0 ? length : DEFAULT_SIZE;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : DEFAULT_SIZE;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length > 0 ? length : DEFAULT_SIZE;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter () {
        return 2 * width + 2 * length;
    }

    @Override
    public boolean isInside  (double x, double y) {
        return Math.abs(x) <= (width / 2) && Math.abs(y) <= (length / 2);
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }

}
