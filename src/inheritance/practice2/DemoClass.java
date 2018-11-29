package inheritance.practice2;

public class DemoClass {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5.0, Shape.Colour.BLACK, true),
                new Rectangle(2.0, 3.0, Shape.Colour.BLUE, false),
                new Square(4.0, Shape.Colour.RED, false)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            if (shape instanceof Rectangle) System.out.println("Area=" + Math.round(((Rectangle) shape).getPerimeter() * 100) / 100.0);
            if (shape instanceof Circle) System.out.println("Area=" + Math.round(((Circle) shape).getArea() * 100) / 100.0);
            System.out.println();
        }

    }

}
