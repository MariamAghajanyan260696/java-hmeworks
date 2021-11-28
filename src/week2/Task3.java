package week2;

import java.util.Scanner;

//.Compute area and perimeter of circle.(Input double type radius from console)(PI = 3.14159)
public class Task3 {
    public static void main(String[] args) {
        double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();

        double area = PI * R * R;
        System.out.println(area);
    }
}

