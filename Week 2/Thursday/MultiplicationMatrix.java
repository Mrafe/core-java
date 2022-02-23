public class MultiplicationMatrix {
    static void multiply(int[][] a, int[][] b) {
        int c[][] = new int[3][3];
        if (a[0].length == b.length) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < 3; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Incorrect Matrices");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };
        int[][] b = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };
        multiply(a, b);
    }
}
