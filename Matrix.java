import java.util.*;

interface Matrix {
    void print(int[][] arr);

    public static void main(String... args) {
        Matrix m = (x) -> {
            for (var i : x)
                System.out.println(Arrays.toString(i));
        };

        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        int[][] a = new int[rows][cols];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = Integer.parseInt(args[(i * cols) + j + 2]);
            }
        }
        m.print(a);
    }
}
