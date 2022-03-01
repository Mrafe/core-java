package week2.Monday;

import java.util.Scanner;

public class Triangle {
    static String CheckType(int side1, int side2, int side3) {
        if (side1 == side2 && side2 == side3)
            return "equilateral triangle";
        else if (side1 == side2 || side2 == side3 || side3 == side1)
            return "isoceless triangle";
        else
            return "scalene triangle";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        System.out.println("It is a " + CheckType(side1, side2, side3));
        scanner.close();
    }
}
