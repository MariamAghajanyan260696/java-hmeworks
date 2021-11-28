package week2;

import java.util.Random;

public class Task6 {
    //Generate and print random integer number between 2 to 7(not using bound)
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        System.out.println(a); // ughaki tpel em vor tesnem  vr tivn e @ntrel
        if (a >= 0) {
            a %= 6;
            System.out.println(a + 2);
        } else {

            a %= 6;
            a *= (-1);

            System.out.println(a + 2);

        }
    }
}
