import java.util.Scanner;

class Arrays {
    static int[] arrayInput(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }

    static void divideNumbers(int a, int b) {
        try {
            double c = a / b;
            System.out.println("The result is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Number cant be divided by zero");

            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = scanner.nextInt();
        int[] arr;
        arr = arrayInput(n);
        try {
            System.out.println("The 5th element is : " + arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array is too small");
        }
        System.out.println("\n\nEnter the two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        divideNumbers(a, b);
        scanner.close();
    }

}