package exceptions.practice4;

public class Exception1 extends Exception {

    private String exc;

    public Exception1(String exc) {
        this.exc = exc;
    }

    @Override
    public String toString() {
        return "Exception1: " + exc;
    }

}
