package generics.practice1;

import inheritance.practice2.Shape;

public class PairTest {

    public static void main(String[] args) {
        Pair<String, Shape> objectsPair = new Pair<String, Shape>("Simple Shape", new Shape());

        String name = objectsPair.getFirst();

        Shape shape = objectsPair.getSecond();

        System.out.println(name + " " + shape);
    }
}
