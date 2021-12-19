package week2;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i =2; i<=x;i++){
            if(x%i==0){
                System.out.println(i);
                break;
            }

        }

    }
}
