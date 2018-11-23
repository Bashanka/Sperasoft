package generics.practice2;

import inheritance.practice2.Shape;
import inheritance.practice2.Square;

public class TestClass {

    public static <F extends Comparable, S extends Comparable> boolean compareTo(F first, S second) {
        return first.toString().compareTo(second.toString()) == 0;
    }



    public static void main(String[] args) {
        String s = "20";
        Integer i = 20;
        System.out.println("String s = \"20\" " + (compareTo(s, i) ? "compares " : "does not compare ") + "Integer i = 20");
    }

}
