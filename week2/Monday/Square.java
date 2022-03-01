package week2.Monday;

import java.io.*;

public class Square {
    static int sq(int a) {
        a *= a;
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int a = Integer.parseInt(br.readLine());
        System.out.println("The square is : " + sq(a));
    }
}
