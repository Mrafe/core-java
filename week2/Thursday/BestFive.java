package week2.Thursday;

import java.util.Scanner;

class BestFive {
    static void init(int[] arr) {
        for (int i = 0; i < 10; i++)
            arr[i] = 0;
    }

    static void topFive(int[] arr) {
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 9; j++) {
                if (arr[i] < arr[j + 1]) {
                    temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". is " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        init(arr);
        System.out.println("Enter the elements");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        topFive(arr);
        scanner.close();
    }
}