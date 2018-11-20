package inheritance.practice3;

public class DemoClass {
    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 3, 4, 5, -3};
        double[] doubles = {0.0, 1.5, 2.7, 3.4, 4.6, 5.2, -3.3};

        System.out.println("min({0, 1, 2, 3, 4, 5, -3}) = " + CustomMath.min(ints));
        System.out.println("min({0.0, 1.5, 2.7, 3.4, 4.6, 5.2, -3.3}) = " + CustomMath.min(doubles));
        System.out.println();

        System.out.println("max({0, 1, 2, 3, 4, 5, -3}) = " + CustomMath.max(ints));
        System.out.println("max({0.0, 1.5, 2.7, 3.4, 4.6, 5.2, -3.3}) = " + CustomMath.max(doubles));
        System.out.println();

        System.out.println("nextAfter({0, 1, 2, 3, 4, 5, -3}, 5) = " + CustomMath.nextAfter(ints, 5));
        System.out.println("nextAfter({0.0, 1.5, 2.7, 3.4, 4.6, 5.2, -3.3}, 5) = " + CustomMath.nextAfter(doubles, 5));
        System.out.println();

        System.out.println("pow(4, 5) = " + CustomMath.pow(4, 5));
        System.out.println("pow(5.6, 3) = " + CustomMath.pow(5.6, 3));
        System.out.println();


    }
}
