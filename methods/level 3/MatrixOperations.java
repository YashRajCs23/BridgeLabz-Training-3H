import java.util.*;
public class MatrixOperations {
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); 
            }
        }
        return matrix;
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows for Matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter cols for Matrix A: ");
        int colsA = sc.nextInt();
        System.out.print("Enter rows for Matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter cols for Matrix B: ");
        int colsB = sc.nextInt();
        int[][] A = createMatrix(rowsA, colsA);
        int[][] B = createMatrix(rowsB, colsB);
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("Addition of A and B:");
            displayMatrix(addMatrices(A, B));
            System.out.println("Subtraction of A and B:");
            displayMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("Addition/Subtraction not possible (different dimensions).");
        }
        if (colsA == rowsB) {
            System.out.println("Multiplication of A and B:");
            displayMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("Multiplication not possible (incompatible dimensions).");
        }
        sc.close();
    }
}