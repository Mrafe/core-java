package week2.Monday;

import java.io.*;

public class Swap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the First Number");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter second Number");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("The values before swapping is  a   : " + a + " b   : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The values after swapping is  a   : " + a + " b   : " + b);
    }
}
