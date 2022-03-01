package week2.Thursday;

import java.util.Scanner;

class DigitExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digit");
        int a = scanner.nextInt();
        while (a > 10) {
            int c = a % 10;
            System.out.println(c);
            a = a / 10;
        }
        System.out.println(a);
        scanner.close();
    }
}