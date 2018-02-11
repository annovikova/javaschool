package week1;

//- The user enters a number and the program needs to check whether entered number is Magic one.
// Magic number: A number is said to be a Magic number if the sum of its digits are calculated till
// a single digit is obtained by recursively adding the sum of its digits. If the single digit comes to be 1 then the number is a magic number.

import java.util.Scanner;

public class HomeWork4 {
        public static void main(String args[])
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number to be checked: ");
            String n=input.next();
            int sum = 0;
            while(n.length()>1) {
                sum = 0;
                for (int i = 0; i < n.length(); i++) {
                    String c = String.valueOf(n.charAt(i));
                    sum = sum + Integer.valueOf(c);
                }
                n = String.valueOf(sum);
            }
            if(Integer.valueOf(n)==1)
            {
                System.out.println("Is a Magic Number.");
            }
            else
            {
                System.out.println("Is not a Magic Number.");
            }
        }
}
