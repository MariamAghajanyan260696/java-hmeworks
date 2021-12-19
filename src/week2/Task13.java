package week2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quiz = scanner.nextDouble();
        double mid_term = scanner.nextDouble();
        double final_score = scanner.nextDouble();
        double average_score = (quiz+mid_term+final_score)/3;
        System.out.println(average_score);
        if(average_score>=80){
            System.out.println("Grade = A");
        }else if(average_score>=60&&average_score<80){
            System.out.println("Grade = B");
        }else if(average_score>=40&&average_score<60){
            System.out.println("Grade = C");
        }else{
            System.out.println("Grade =F");
        }
    }
}

