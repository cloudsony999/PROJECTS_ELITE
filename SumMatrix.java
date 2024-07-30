import java.util.*;

interface SumMatrix {
    void print(int[][] arr, int[][] arr1);

    public static void main(String... args) {
        SumMatrix m = (x, y) -> {
            int[][] sum = new int[x.length][x[0].length];
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[0].length; j++) {
                    sum[i][j] = x[i][j] + y[i][j];
                }
            }
            for (var row : sum) {
                System.out.println(Arrays.toString(row));
            }
        };

        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        int offset = 2;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = Integer.parseInt(args[offset + (i * cols) + j]);
            }
        }

        offset += rows * cols;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = Integer.parseInt(args[offset + (i * cols) + j]);
            }
        }

        m.print(a, b);
    }
}
