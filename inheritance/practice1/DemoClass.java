package inheritance.practice1;

public class DemoClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5, Circle.Colour.BLUE);
        System.out.println(circle.toString());
        System.out.println("Circle area is " + Math.round(circle.getArea() * 100) / 100.0);
        System.out.println();

        Cylinder cylinder = new Cylinder(5, 10, Circle.Colour.GREEN);
        System.out.println(cylinder.toString());
        System.out.println("Cylinder area is " + Math.round(cylinder.getArea() * 100) / 100.0);
        System.out.println("Cylinder volume is " + Math.round(cylinder.getVolume() * 100) / 100.0);
    }
}
