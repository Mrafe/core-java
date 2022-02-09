import java.util.Scanner;

public class Quadrant {
    static int quadrant(int x, int y) {
        if (x > 0) {
            return (y > 0) ? 1 : 4;
        } else {
            return (x < 0) ? 3 : 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("The coordinates are of " + quadrant(x, y) + " quadrant");
        scanner.close();
    }
}
