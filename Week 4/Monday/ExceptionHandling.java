import java.util.Scanner;

class ExceptionHandling {
    static double result(int a, int b, int c) {
        try {
            double result = a / b;
            result = result / c;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by 0");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double size = result(a, b, c);

        System.out.println("The result is: " + size);
        int[] arr = new int[(int) size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        try {
            System.out.println("The 3rd element of array is " + arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array is too small");
        }
        scanner.close();
    }
}
