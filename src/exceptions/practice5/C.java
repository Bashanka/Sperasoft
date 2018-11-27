package exceptions.practice5;

public class C extends B{

    private String exc;

    public C(String exc) {
        super(exc);
        this.exc = exc;
    }

    @Override
    public String toString() {
        return "C: " + exc;
    }
}
