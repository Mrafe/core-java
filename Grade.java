import java.util.Scanner;

public class Grade {
    static char grade(int marks) {
        if (marks >= 90)
            return 'A';
        else if (marks >= 80)
            return 'B';
        else if (marks >= 70)
            return 'C';
        else if (marks >= 60)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int phy = scanner.nextInt();
        int chem = scanner.nextInt();
        int maths = scanner.nextInt();
        int marks = (phy + chem + maths) / 3;
        System.out.println("The grade is : " + grade(marks));
        scanner.close();
    }
}
