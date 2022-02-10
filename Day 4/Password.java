import java.util.Scanner;

public class Password {
    static int countLowercase(String s) {
        int n = s.length();
        int lowercase = 0;
        for (int i = 0; i < n; i++) {
            int c = s.codePointAt(i);
            if (c >= 97 && c <= 122) {
                lowercase++;
            }
        }
        return lowercase;
    }

    static int countUppercase(String s) {
        int n = s.length();
        int uppercase = 0;
        for (int i = 0; i < n; i++) {
            int c = s.codePointAt(i);
            if (c >= 65 && c <= 90) {
                uppercase++;
            }
        }
        return uppercase;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String pwd = scanner.nextLine();
        int lowercase = countLowercase(pwd);
        int uppercase = countUppercase(pwd);
        int digit = pwd.length() - lowercase - uppercase;
        System.out.println("There are \n" + lowercase + " lowercase\n" + uppercase + " uppercase\n" + digit
                + " digits");
        scanner.close();
    }

}
