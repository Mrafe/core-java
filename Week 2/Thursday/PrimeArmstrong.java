import java.io.*;

public class PrimeArmstrong {
    static boolean isArmstrong(int num) {
        int temp = num;
        int arm = 0;
        while (temp != 0) {
            int c = temp % 10;
            arm = arm * 10 + (c * c * c);
            temp /= 10;
        }
        return (arm == num);
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the limit");
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            if (isPrime(i))
                System.out.println(i + " is a Prime number");
            else if (isArmstrong(i))
                System.out.println(i + " is an Armstrong number");
            else
                System.out.println(i + " is neither a prime nor an armstrong number");
        }
    }
}
