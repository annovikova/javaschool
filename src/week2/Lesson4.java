package week2;

    public class Lesson4 {
        private int myVar=100;

        public static void main(String[] args) {
            Lesson4 lesson = new Lesson4();
            Lesson4 lesson2 = new Lesson4();
            Lesson4 Lesson4 = new Lesson4();

            lesson.setMyVar(99);
            lesson2.setMyVar(88);

            lesson.printMyVar();
            lesson2.printMyVar();
            Lesson4.printMyVar();
        }

        private void setMyVar(int i) {
            myVar = i;
        }

        private void printMyVar() {
            System.out.println(myVar);
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
