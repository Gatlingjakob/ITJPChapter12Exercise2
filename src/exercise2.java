/**
 * Created by Jakob on 12-09-2016.
 */

import java.util.*;

public class exercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 integers: ");

        int a = 0;
        int b = 0;
        boolean flag = false;

        while (!flag) {

            try {
                a = input.nextInt();
                b = input.nextInt();

                flag = true;
            } catch (InputMismatchException ex) {

                input.nextLine();
                System.out.println("No way, boy!" );
                System.out.print("Enter 2 integers:");
            }

        }
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
