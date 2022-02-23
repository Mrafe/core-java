import java.util.Scanner;

class MathUtils {
    static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Argument passed should not be less than 0");
        }
        if (n > 16) {
            throw new IllegalArgumentException("Argument passed should not be greater than 16");
        }
        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }
}

class ExcepitonFactorial {

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try {
            System.out.println("The Factorial is " + MathUtils.factorial(num));

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        sc.close();
    }
}
