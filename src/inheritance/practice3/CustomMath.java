package inheritance.practice3;

public class CustomMath {

    public static int min(int[] arr) {
        int min = arr[0];
        for (int a : arr) {
            if (a < min) min = a;
        }
        return min;
    }

    public static double min(double[] arr) {
        double min = arr[0];
        for (double a : arr) {
            if (a < min) min = a;
        }
        return min;
    }

    private double minDouble(double[] arr) {
        double min = arr[0];
        for (double a : arr) {
            if (a < min) min = a;
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int a : arr) {
            if (a > max) max = a;
        }
        return max;
    }

    public static double max(double[] arr) {
        double max = arr[0];
        for (double a : arr) {
            if (a > max) max = a;
        }
        return max;
    }

    public static int nextAfter(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > number) return i;
        }
        return 0;
    }

    public static int nextAfter(double[] arr, double number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > number) return i;
        }
        return 0;
    }

    public static int pow(int base, int exponent) {
        int r = 1;
        for (int i = 0; i < exponent; i++) r *= base;
        return r;
    }

    public static double pow(double base, int exponent) {
        double r = 1.0;
        for (int i = 0; i < exponent; i++) r *= base;
        return r;
    }

}
