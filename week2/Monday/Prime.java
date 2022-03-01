package week2.Monday;

public class Prime {
    static boolean isPrime(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 823;
        if (isPrime(a))
            System.out.println("It is a prime number");
        else
            System.out.println("Not a prime number");
    }
}
