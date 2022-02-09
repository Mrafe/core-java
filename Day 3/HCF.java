import java.util.Scanner;

public class HCF {
    static int HighestFactor(int a, int b) {
        int c = (a > b) ? b : a;
        int hcf = 0;
        for (int i = 1; i < c; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        return hcf;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("The HCF is " + HighestFactor(a, b));
        scanner.close();
    }

}
