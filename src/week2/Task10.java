package week2;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Task10 {
    /*Given 3 real numbers a , b , c .FInd all decisions for
ax2 + bx + c = 0.Print all decisions, if there is not a decision ,print “Can't be”.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Can't be");
        } else if (D == 0) {
            double x0 = -b / 2 * a;
            System.out.println("x0 = " + x0);
        } else {
            double x1 = (-b - sqrt(D) ) / (2 * a); //chi statsvum D-its armat hanel
            double x2 = (-b + sqrt(D) )/ (2 * a);

            System.out.println("x1 = " + x1 + ", x2 =  " + x2);
            System.out.println();
        }
    }
}