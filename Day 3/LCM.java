import java.util.Scanner;

public class LCM {
    static int LeastMultiple(int a, int b) {
        int c = (a < b) ? a : b;
        while (true) {
            if (c % a == 0 && c % b == 0)
                break;
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("The LCM is : " + LeastMultiple(a, b));
        scanner.close();
    }
}
