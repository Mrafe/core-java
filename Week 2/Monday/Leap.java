import java.io.*;

public class Leap {
    static boolean leapcheck(int year) {
        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the year");
        int year = Integer.parseInt(reader.readLine());
        if (leapcheck(year))
            System.out.println("It is a leap year");
        else
            System.out.println("Not a leap year");
    }
}
