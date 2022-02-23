import java.io.*;

public class Armstrong {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int num = Integer.parseInt(reader.readLine());
        int temp = num;
        int arm = 0;
        while (temp != 0) {
            int c = temp % 10;
            arm = arm * 10 + (c * c * c);
            temp /= 10;
        }
        System.out.println(arm == num);
    }
}
