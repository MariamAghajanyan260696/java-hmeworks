package week2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                for (int j = 1; j <= b / 2; j++) {
                    if (j * j == i) {
                        System.out.println(i);
                    }
                }
            }

        } else {
            System.out.println("Nothing");
        }

    }
}
