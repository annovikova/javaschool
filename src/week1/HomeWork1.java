package week1;

import java.util.Scanner;

// Prepare a programming task, where a user needs to input some value, the program is performing some calculations and
// printing out results in the console (example: inch to cm converter or vice versa)
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number in m");
        double x = input.nextDouble();

        double result = x * 100;
        System.out.println("Product is " + result + " cm");
    }
}
