package week2;

public class Lesson3 {

    private int privateVariable; //dostupen lish dlja metodov etogo clasa (dazhe dlja nasledovanija ne vidno)

    protected static int PROTECTED_CONST = 100;

    final static double PACKAGE_PRIVATE_CONST = 10.0;

    public int PUBLIC_VARIABLE = 100;

    public static void main(String[] args) {
    }

    protected void oneProtectedMethod() {
        System.out.println("Protected method called");
    }

    void packagePrivateMethod() {
        System.out.println("Package-private method was called");
    }

    public void getNewNumber(int d) throws NegativeNumberException {
        if (d < 0) {
            throw new NegativeNumberException("Negative numbers are restricted!");
        }

    }

    public class NegativeNumberException extends Exception {
        public NegativeNumberException(){};

        public NegativeNumberException(String message) {
            super(message);
        }
    }

}
