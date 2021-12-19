package week2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % 7 == 0 || b % 7 == 0) {
            if (a > 0 && b > 0) {
                if (a > b) {
                    for (int i = b; i <= a; i++) {
                        if (i % 2 == 1) {

                            System.out.println(i);
                        }
                    }
                }
                else{
                    for (int i = a; i <= b; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                }
            }
        } else {
            System.out.println("nothing " );

        }
    }
}
// inchi vochmiban chi tpum ??

