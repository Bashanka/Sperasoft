package abstaractinterface.Practice1;

public class Square extends Rectangle {


    public Square() {
        super();
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(double size, Colour colour, boolean filled) {
        super(size, size, colour, filled);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth()+ ", which is a subclass of " + super.toString();
    }

}
