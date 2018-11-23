package exceptions.practice2;

public class Demo {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finnaly");
        }
    }
}
