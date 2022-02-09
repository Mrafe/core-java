import java.util.Scanner;

public class MaxMin {
    static int Min(int a, int b, int c) {
        return ((a < b && a < c) ? a : (b < c) ? b : c);
    }

    static int Max(int a, int b, int c) {
        return ((a > b && a > c) ? a : (b > c) ? b : c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Smallest is " + Min(num1, num2, num3));
        System.out.println("Largest is " + Max(num1, num2, num3));
        scanner.close();
    }
}
