package exceptions.practice4;

public class Demo {

    public static void main(String[] args) {
        try {
            int a = 5;
            if (a < 0) {
                throw new Exception1("Some Exception1");
            } else if (a == 0) {
                throw new Exception2("Some Exception2");
            } else {
                throw new Exception3("Some Exception3");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
