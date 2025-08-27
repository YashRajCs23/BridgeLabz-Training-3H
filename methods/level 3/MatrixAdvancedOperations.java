import java.util.*;
public class MatrixAdvancedOperations {
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    public static int determinant3x3(int[][] m) {
        int det = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        return det;
    }
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) {
            System.out.println("Inverse does not exist (det=0)");
            return null;
        }
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] = m[0][0] / (double)det;
        return inv;
    }
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) {
            System.out.println("Inverse does not exist (det=0)");
            return null;
        }
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int r = 0, c = 0;
                for (int row = 0; row < 3; row++) {
                    if (row == i) continue;
                    c = 0;
                    for (int col = 0; col < 3; col++) {
                        if (col == j) continue;
                        minor[r][c] = m[row][col];
                        c++;
                    }
                    r++;
                }
                int minorDet = determinant2x2(minor);
                inv[j][i] = Math.pow(-1, i + j) * minorDet / (double)det;
            }
        }
        return inv;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(Math.round(val * 100.0) / 100.0 + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();
        int[][] matrix = createMatrix(n, n);
        System.out.println("Matrix:");
        displayMatrix(matrix);
        System.out.println("Transpose:");
        displayMatrix(transpose(matrix));
        if (n == 2) {
            int det = determinant2x2(matrix);
            System.out.println("Determinant: " + det);
            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("Inverse:");
                displayMatrix(inv);
            }
        } else if (n == 3) {
            int det = determinant3x3(matrix);
            System.out.println("Determinant: " + det);
            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("Inverse:");
                displayMatrix(inv);
            }
        }
        sc.close();
    }
}