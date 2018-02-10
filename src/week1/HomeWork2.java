package week1;

//- Users enter a number and the program need to check whether it's odd or even

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        double x = input.nextDouble();
        double mod = x % 2;
        if (mod == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
