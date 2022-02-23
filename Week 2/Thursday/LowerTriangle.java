public class LowerTriangle {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int r = arr.length;
        int c = arr[0].length;
        System.out.println("Lower triangular matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j >= i)
                    System.out.print(" ");
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
