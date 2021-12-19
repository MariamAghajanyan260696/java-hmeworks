package week2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int rev_num = 0;
        while (x>0){
            rev_num=rev_num*10+x%10;
            x=x/10;

        }
        System.out.println(rev_num);
    }
}
