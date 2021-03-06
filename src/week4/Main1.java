package week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double enteredValue = scanner.nextDouble();
            System.out.println("Entered the following value: " + enteredValue);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException happened!");
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException happened!");
        } finally {
            System.out.println("Finally executed");
        }

        System.out.println("End of method");

    }
}