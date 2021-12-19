package week2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c =  scanner.nextInt();
        int d =  scanner.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % d == c) {
                    System.out.println(i);
                }
            }

        }else if (a>=b){
            for(int i = a;i>=b;i--){
                if(i%d==c){
                    System.out.println(i);
                }
            }

        }
    }
}
