package week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Write java program, which has byte type variable(Input variables from console)
Cast byte to short type, print both variables
Cast short to int type, print both variables
Cast int to long, print both variables
Cast long to float, print both variables
Cast float to double type, print both variables

         */
        Scanner scanner = new Scanner(System.in);
        byte a = scanner.nextByte();

        short aShort = a;
        System.out.println(a + " " + aShort);
        short b = scanner.nextShort();
        int bInt = b;
        System.out.println(b + " " + bInt);
        int c = scanner.nextInt();
        long cLong = c;
        System.out.println(c + " " + cLong);
        long d = scanner.nextLong();
        float dFloat = d;
        System.out.println( d +" " + dFloat);
        float e = scanner.nextFloat();
        double eDouble = e ;
        System.out.println(e + " apres " + eDouble);
    }

}
