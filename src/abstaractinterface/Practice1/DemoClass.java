package abstaractinterface.Practice1;

public class DemoClass {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5.0, Shape.Colour.BLACK, true),
                new Rectangle(2.0, 3.0, Shape.Colour.BLUE, false),
                new Square(4.0, Shape.Colour.RED, false)
        };



        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Object perimeter is " + Math.round(shape.getPerimeter() * 100) / 100);
            System.out.println("Object area is " + Math.round(shape.getArea() * 100) / 100);
            System.out.println("The point (2, 2) is "  + (shape.isInside(2, 2) ? "" : "not ") + "in this Shape");
            System.out.println();
        }

    }

}
