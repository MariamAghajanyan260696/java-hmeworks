package week2;

import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        int num8 = scanner.nextInt();
        int num9 = scanner.nextInt();
        int num10 = scanner.nextInt();
        long sum = 0;
        if (num1 > 0 && num2 > 0 && num3 > 0 && num4 > 0 && num5 > 0 && num6 > 0 && num7 > 0 && num8 > 0 && num9 > 0 && num10 > 0 ) {

            sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
            System.out.println(sum);

        }
    }
}