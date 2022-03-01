package week2.Thursday;

public class AdditionMatrix {
    static void add(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int[] arr : c) {
            for (int arr1 : arr) {
                System.out.print(arr1 + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };
        int[][] b = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };
        add(a, b);
    }
}
