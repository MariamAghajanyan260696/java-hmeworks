package week2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0;
        while(x > 0) {
            if (x % 10 == d) {
                count ++;
            }
            x=x/10;
        }
        System.out.println(count);
    }
}