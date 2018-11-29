package exceptions.practice4;

public class Exception3 extends Exception {

    private String exc;

    public Exception3(String exc) {
        this.exc = exc;
    }

    @Override
    public String toString() {
        return "Exception3: " + exc;
    }

}
