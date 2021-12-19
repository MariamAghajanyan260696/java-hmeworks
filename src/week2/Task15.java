package week2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k =0;
        for(int i =1;i<N;i*=2) {
            k++;
        }
        System.out.println(k);
        }

    }


