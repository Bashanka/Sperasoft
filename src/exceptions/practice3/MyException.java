package exceptions.practice3;

public class MyException extends ArithmeticException{

    private String exc;

    public MyException(String exc) {
        this.exc = exc;
    }

    @Override
    public String toString() {
        return "MyException: " + exc;
    }

}
