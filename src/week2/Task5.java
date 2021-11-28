package week2;

import java.util.Scanner;

public class Task5 {
    /*Write a Java program to allow the user to input his/her age.
    Then the program will show if the person is
     eligible to vote. A person who is eligible to vote
     must be older than or equal to 18 years old.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte x = scanner.nextByte();
        if (x< 18){
            System.out.println("ches kara @ntres");}
        if (x>=18){
            System.out.println("Duq patrast eq @ntrutyan");
        }

    }
}
