package week2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print integer number ");
        int N = scanner.nextInt();
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i *= 2;
        }
    }
}
