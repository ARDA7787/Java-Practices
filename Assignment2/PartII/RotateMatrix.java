import java.util.*;

public class RotateMatrix {

    public static int[][] rotatedMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0][0]; 
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotated = new int[cols][rows]; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotated[j][rows - 1 - i] = matrix[i][j]; 
            }
        }

        return rotated;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        printMatrix(rotatedMatrix(matrix1));
        printMatrix(rotatedMatrix(matrix2));
        printMatrix(rotatedMatrix(matrix3));
    }
}
