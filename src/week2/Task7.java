package week2;

import java.util.Scanner;

public class Task7 {
    /* 7. Input from console int a and int b, if a and b corresponds for following requirements print “Both a and b legal”, if any of them does not correspond print about it like this “a is legal b is illegal ''. or vice versa
a > 10 and b is not equal to 10
both a and b is positive
both a and b is negative
a > 10 b < 1 both of them are odd
a is a multiple of 5 OR b is a multiple of 5
a is not a multiple of 5 but b is a multiple of 5 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // point 1
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        }
        if (a > 10 && b == 10) {
            System.out.println("a is legal b is illegal");
        }
        if (a < 10 && b != 10) {
            System.out.println(" a is illegal b is legal");
        }
        if (a < 10 && b == 10) {
            System.out.println("Both a and b illegal");
        }
        //point 2
        if (a > 0 && b > 0) {
            System.out.println("Both a and b legal");
        }
        if (a > 0 && b <= 0) {
            System.out.println("a is legal b is illegal");
        }
        if (a <= 0 && b > 0) {
            System.out.println(" a is illegal b is legal");
        }
        if (a <= 0 && b <= 0) {
            System.out.println("Both a and b illegal");
        }
        //point 3
        if (a < 0 && b < 0) {
            System.out.println("Both a and b legal");
        }
        if (a < 0 && b >= 0) {
            System.out.println("a is legal b is illegal");
        }
        if (a >= 0 && b < 0) {
            System.out.println(" a is illegal b is legal");
        }
        if (a >= 0 && b >= 0) {
            System.out.println("Both a and b illegal");
        }
        //point 4
        if (a > 10 && b < 1) {
            if (a % 2 == 1 && b % 2 == -1)
                System.out.println("Both a and b legal");
        }
        if (a > 10 && b >= 1) {
            if (a % 2 == 1)
                System.out.println(" a is legal  b is illegal");
        }
        if (a <= 10 && b < 1) {
            if (b % 2 == -1)
                System.out.println(" a  is illegal  b is  legal");
        }
        if (a <= 10 && b >= 1) {

            System.out.println("Both a and b illegal");
        }


        //pooint 5

        if ((a % 5 == 0) || (b % 5 == 0)) {
            System.out.println("Bboth a and b are legal");
        } else if ((a % 5 != 0) || (b % 5 == 0)) {
            System.out.println("BOTH a and b are legal");
        }  else if ((a % 5 == 0) || (b % 5 != 0)) {
            System.out.println("BOTH a AND b are legal");
        } else {
            System.out.println("Both of them are illegal");
        }
        // chisht e che vor ays depqum erb mutqagrum  em 10 u 48 tver@ ham arajin toghn e tpum hamel errord??

// point 6
        if ((a % 5 != 0) && (b % 5 == 0)) {
            System.out.println("Both a and b are legal");
        }  else if ((a % 5 != 0)&& (b % 5 != 0)) {
            System.out.println("a is legal, b is illegal");
        } else if ((a % 5 == 0)&& (b % 5 != 0)) {
            System.out.println("a is illegal, b is legal");
        } else {
            System.out.println("Both of them are illegal");

        }

    }
}


