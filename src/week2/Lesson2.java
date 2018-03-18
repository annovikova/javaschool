package week2;

public class Lesson2 {

    public static void main(String[] args) {
        Lesson2 lesson = new Lesson2();

        try {
            lesson.getNewNumber(-10);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
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


