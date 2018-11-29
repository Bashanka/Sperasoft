package exceptions.practice1;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3};
        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
