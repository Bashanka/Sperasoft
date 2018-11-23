package exceptions.practice5;

public class A extends Exception {

    private String exc;

    public A(String exc) {
        this.exc = exc;
    }

    @Override
    public String toString() {
        return "A: " + exc;
    }

}
