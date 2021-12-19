package week2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        if (x > 0 && y > 0 && x1 > 0 && y1 > 0) {
            System.out.println(" In the same  quarter ");
        }
        if (x < 0 && y > 0 && x1 < 0 && y1 > 0) {
            System.out.println("In the same  quarter ");
        }
        if (x > 0 && y < 0 && x1 > 0 && y1 < 0) {
            System.out.println("In the same  quarter ");
        }
        if (x < 0 && y < 0 && x1 < 0 && y1 < 0) {
            System.out.println("Print in the same  quarter ");
        } else {
            System.out.println("Not in the same  quarter ");
        }
    }
}
