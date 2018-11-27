package exceptions.practice5;

public class Demo {

    public static void main(String[] args) {
        try {
            throw new C("Some exception");
        } catch (A e) {
            System.out.println(e);
        }
    }

}
