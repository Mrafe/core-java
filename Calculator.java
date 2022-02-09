import java.util.*;

public class Calculator {
    static void add(int a, int b) {
        System.out.println("Sum is : " + a + b);
    }

    static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("cannot divide by zero");
            System.exit(0);
        }
        System.out.println("The solution is : " + a / b);
    }

    static void Sub(int a, int b) {
        System.out.println("The difference is : " + (a - b));
    }

    static void mod(int a, int b) {
        System.out.println("The Modulus is : ");
    }

    static void mul(int a, int b) {
        System.out.println("The product is : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Select the operation you want to perform");
        System.out.println("1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Modulus \n");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                add(a, b);
                break;
            case 2:
                Sub(a, b);
                break;
            case 3:
                mul(a, b);
                break;
            case 4:
                divide(a, b);
                break;
            case 5:
                mod(a, b);
                break;
            default:
                System.out.println("Incorrect operation");
        }
    }
}
