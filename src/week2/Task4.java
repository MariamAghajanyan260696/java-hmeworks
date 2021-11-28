package week2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*4. What happens if concatenate string and another primitive type
concatenate integer + integer, print output
concatenate String + integer with other primitive types.
Example of output` 5 + 10 = 15*/
       Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt();
       int y = scanner.nextInt();
        System.out.println(x + y);
        int z = scanner.nextInt();
        String k = " barev ";
        System.out.println(k + z);


    }
}
