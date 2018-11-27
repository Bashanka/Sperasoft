package exceptions.practice3;

public class Demo {

    public static void main(String[] args) {
        try {
            throw new MyException("Some exception");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
