import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give input :");
        String s = "";
        int k = 0;
        while (true) {
            s = scanner.nextLine();
            if (s.equals("q"))
                break;
            k++;
        }
        System.out.println("The number of integer inputs are" + k);
        scanner.close();
    }
}
