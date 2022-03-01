package week2.Friday;

import java.util.Scanner;

class AddNums {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int sum;

    public AddNums() {
        sum = 0;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public AddNums(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public AddNums(int num1, int num2, int num3) {
        this(num1, num2);
        this.num3 = num3;
    }

    public AddNums(int num1, int num2, int num3, int num4) {
        this(num1, num2, num3);
        this.num4 = num4;
    }

    void add(int num1, int num2) {
        sum = num1 + num2;
    }

    void add(int num1, int num2, int num3) {
        sum = num1 + num2 + num3;
    }

    void add(int num1, int num2, int num3, int num4) {
        sum = num1 + num2 + num3 + num4;
    }

    void display() {
        System.out.println("The sum is " + sum);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of inputs: ");
        int a = scanner.nextInt();
        AddNums obj = new AddNums();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        System.out.println("Enter the numbers");
        switch (a) {
            case 2:
                num1 = scanner.nextInt();
                obj.setNum1(num1);
                num2 = scanner.nextInt();
                obj.setNum2(num2);
                obj.add(num1, num2);
                obj.display();
                break;
            case 3:
                num1 = scanner.nextInt();
                obj.setNum1(num1);
                num2 = scanner.nextInt();
                obj.setNum2(num2);
                num3 = scanner.nextInt();
                obj.setNum3(num3);
                obj.add(num1, num2, num3);
                obj.display();
                break;
            case 4:
                num1 = scanner.nextInt();
                obj.setNum1(num1);
                num2 = scanner.nextInt();
                obj.setNum2(num2);
                num3 = scanner.nextInt();
                obj.setNum3(num3);
                num4 = scanner.nextInt();
                obj.setNum4(num4);
                obj.add(num1, num2, num3, num4);
                obj.display();
                break;
            default:
                System.out.println("Incorrect Option");
        }
        scanner.close();
    }
}
