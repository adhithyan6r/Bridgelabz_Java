package javaMethods.Level3;
//Perform matrix addition, subtraction, multiplication, transpose, determinant, and inverse operations.
public class Matrix {
    // Method: Create a random matrix using the given rows and columns.
    public static int[][] createRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = 1 + (int) (Math.random() * 9);
            }
        }
        return matrix;
    }
    // Method: Add two matrices
    public static int[][] addMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int columns = first[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }
    // Method: Subtract two matrices
    public static int[][] subtractMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int columns = first[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = first[i][j] - second[i][j];
            }
        }
        return result;
    }
    // Method: Multiply two matrices
    public static int[][] multiplyMatrices(int[][] first, int[][] second) {
        int rows = first.length;
        int columns = second[0].length;
        int common = second.length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return result;
    }
    // Method: Find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1]
                - matrix[0][1] * matrix[1][0];
    }
    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        int determinant =
                matrix[0][0] * (
                        matrix[1][1] * matrix[2][2]
                                - matrix[1][2] * matrix[2][1]
                )
                        - matrix[0][1] * (
                        matrix[1][0] * matrix[2][2]
                                - matrix[1][2] * matrix[2][0]
                )
                        + matrix[0][2] * (
                        matrix[1][0] * matrix[2][1]
                                - matrix[1][1] * matrix[2][0]
                );
        return determinant;
    }
    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            return new double[][]{};
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }
    // Method: Find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            return new double[][]{};
        }
        double[][] inverse = new double[3][3];
        inverse[0][0] = (
                matrix[1][1] * matrix[2][2]
                        - matrix[1][2] * matrix[2][1]
        ) / (double) determinant;
        inverse[0][1] = (
                matrix[0][2] * matrix[2][1]
                        - matrix[0][1] * matrix[2][2]
        ) / (double) determinant;
        inverse[0][2] = (
                matrix[0][1] * matrix[1][2]
                        - matrix[0][2] * matrix[1][1]
        ) / (double) determinant;
        inverse[1][0] = (
                matrix[1][2] * matrix[2][0]
                        - matrix[1][0] * matrix[2][2]
        ) / (double) determinant;
        inverse[1][1] = (
                matrix[0][0] * matrix[2][2]
                        - matrix[0][2] * matrix[2][0]
        ) / (double) determinant;
        inverse[1][2] = (
                matrix[0][2] * matrix[1][0]
                        - matrix[0][0] * matrix[1][2]
        ) / (double) determinant;
        inverse[2][0] = (
                matrix[1][0] * matrix[2][1]
                        - matrix[1][1] * matrix[2][0]
        ) / (double) determinant;
        inverse[2][1] = (
                matrix[0][1] * matrix[2][0]
                        - matrix[0][0] * matrix[2][1]
        ) / (double) determinant;
        inverse[2][2] = (
                matrix[0][0] * matrix[1][1]
                        - matrix[0][1] * matrix[1][0]
        ) / (double) determinant;
        return inverse;
    }
    // Method: Display an integer matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
    // Method: Display a double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Input: Create two random 3x3 matrices
        int[][] firstMatrix = createRandomMatrix(3, 3);
        int[][] secondMatrix = createRandomMatrix(3, 3);
        System.out.println("First Matrix:");
        displayMatrix(firstMatrix);
        System.out.println("\nSecond Matrix:");
        displayMatrix(secondMatrix);
        System.out.println("\nAddition:");
        displayMatrix(addMatrices(firstMatrix, secondMatrix));
        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(firstMatrix, secondMatrix));
        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrices(firstMatrix, secondMatrix));
        System.out.println("\nTranspose of First Matrix:");
        displayMatrix(transposeMatrix(firstMatrix));
        System.out.println("\nDeterminant of First Matrix: " + determinant3x3(firstMatrix));
        System.out.println("\nInverse of First Matrix:");
        double[][] inverse = inverse3x3(firstMatrix);
        if (inverse.length == 0) {
            System.out.println("Inverse does not exist because determinant is zero.");
        } else {
            displayMatrix(inverse);
        }
    }
}