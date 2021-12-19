package week2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max =a ;

        int k = (max < b) ? (max = b) : max;
        int p = (max < c) ? (max = c) : max;
        System.out.println(max);
// vonts karam anem vor menak max-I togh@ tpi  u mi hat max popoxakan unenam ??


    }
}
