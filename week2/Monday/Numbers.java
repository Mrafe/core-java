package week2.Monday;

import java.io.*;

public class Numbers {
    static void check(int a) {
        if (a % 2 == 0)
            System.out.println("It is a even number");
        else
            System.out.println("It is an odd number");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int a = Integer.parseInt(reader.readLine());
        check(a);
    }
}
