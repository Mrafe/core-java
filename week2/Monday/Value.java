package week2.Monday;

import java.util.*;

public class Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int m = scanner.nextInt();
        if (m == 0)
            System.out.println("The Value of N is 0");
        else if (m > 0)
            System.out.println("The Value of N is 1");
        else
            System.out.println("The Value of N is -1");
        scanner.close();
    }
}
