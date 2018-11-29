package exceptions.practice4;

public class Exception2 extends Exception {

    private String exc;

    public Exception2(String exc) {
        this.exc = exc;
    }

    @Override
    public String toString() {
        return "Exception2: " + exc;
    }

}
