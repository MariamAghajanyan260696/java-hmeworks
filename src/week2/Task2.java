package week2;

import java.util.Scanner;

public class Task2 {
    /*2. Write java program, which has double type variable(Input variable from console)
Cast double to float,print both variables
Cast float to long, print both variables
Cast long to int, print both variables
Cast int to short, print both results
Cast short to byte, print both results */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doubleTiv = scanner.nextDouble();
        float floatTiv = (float) doubleTiv;
        System.out.println(doubleTiv + " " + floatTiv);

        float floattiv2 = scanner.nextFloat();
        long longtiv2 = (long) floattiv2 ;
        System.out.println(longtiv2 +" " + floattiv2);

        long longtiv3 = scanner.nextLong();
        int inttiv3 = (int) longtiv3 ;
        System.out.println(inttiv3 +" " + longtiv3);

        int inttiv4 = scanner.nextInt();
        short shorttiv4 = (short) inttiv4 ;
        System.out.println(inttiv4 +" " + shorttiv4);

        short shorttiv5 = scanner.nextShort();
        byte bytetiv5 = (byte) shorttiv5 ;
        System.out.println(shorttiv5 +" apres " + bytetiv5);

    }
}
