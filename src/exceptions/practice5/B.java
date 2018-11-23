package exceptions.practice5;

public class B extends A {

    private String exc;

    public B(String exc) {
        super(exc);
        this.exc = exc;
    }

    @Override
    public String toString() {
        return "B: " + exc;
    }

}
