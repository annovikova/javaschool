package week2;

import java.util.Scanner;
import static java.lang.Math.round;

public class Lesson1 {
    public static void main(String[] args) {
        String a = "Hello,";
        String b = "World!";
        String c1 = a + " Java " + b;
        String c2 = String.format("%s Java %s", a, b, c1);
        System.out.println(c2);
        String c3 = String.join(" ", a, "Java", b); //space entered between
        System.out.println(c3);

//        int n = 7;
//        String d1 = "There are " + n + " days in a week"; //
//        String d2 = String.format("There are %s days in a week", n);
//        System.out.println(d2);

//        double a = 200;
//        double b = 50;
//        double c = a + b;
//        System.out.println("c variable = " + c );
//        double d = c / 4 * 2;
//        System.out.println("c variable = " + round(d) );
//        double e = 1000 - c * 2;
//        System.out.println("c variable = " + e );
//        double f = (1000 - c) * 2;
//        System.out.println("c variable = " + f );

        }
    }
