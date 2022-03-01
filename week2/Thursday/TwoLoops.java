package week2.Thursday;

public class TwoLoops {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("The Sum upto " + i + " is " + sum);
        }
        System.out.println("\n\n");
        sum = 0;
        int k = 1;
        while (true) {
            sum += k;
            if (sum > 100)
                break;
            else {
                System.out.println("The Sum upto " + k + " is " + sum);
                k++;
            }
        }
        System.out.println("The sum exceeds 100 at : " + k);
    }
}
