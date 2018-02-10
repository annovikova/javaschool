package week1;

//- User enters a number and the program needs to check whether it's CUBIC NUMBER ( a cubic number is the third power of a number as in a x a x a = a3 )

import java.util.Scanner;

import static java.lang.Math.cbrt;
import static java.lang.Math.round;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        double x = input.nextDouble();
        double cubic = cbrt(x);
        if (cubic == round(cubic)) {
            System.out.println("Cubic Number");
        } else {
            System.out.println("Not cubic number");
        }
    }
}
