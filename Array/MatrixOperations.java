// MatrixOperations.java
// This program demonstrates operations on a 2D array (matrix).
// It includes the following operations:
// 1. Initializing a matrix
// 2. Displaying the matrix
// 3. Calculating the sum of all elements in the matrix
// 4. Finding the transpose of the matrix
// 5. Calculating the sum of each row
// 6. Calculating the sum of each column

// The program uses various methods to perform these operations and displays the results.

public class MatrixOperations {
    public static void main(String[] args) {
        // Initialize a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Display the matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Calculate and display the sum of all elements
        int sum = calculateSum(matrix);
        System.out.println("Sum of all elements: " + sum);

        // Find and display the transpose of the matrix
        int[][] transpose = transposeMatrix(matrix);
        System.out.println("Transpose of the Matrix:");
        displayMatrix(transpose);

        // Calculate and display the sum of each row
        System.out.println("Sum of each row:");
        int[] rowSums = calculateRowSums(matrix);
        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Sum of row " + i + ": " + rowSums[i]);
        }

        // Calculate and display the sum of each column
        System.out.println("Sum of each column:");
        int[] colSums = calculateColSums(matrix);
        for (int i = 0; i < colSums.length; i++) {
            System.out.println("Sum of column " + i + ": " + colSums[i]);
        }
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to calculate the sum of all elements in the matrix
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Method to find the transpose of the matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to calculate the sum of each row
    public static int[] calculateRowSums(int[][] matrix) {
        int[] rowSums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rowSums[i] += matrix[i][j];
            }
        }
        return rowSums;
    }

    // Method to calculate the sum of each column
    public static int[] calculateColSums(int[][] matrix) {
        int[] colSums = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                colSums[j] += matrix[i][j];
            }
        }
        return colSums;
    }
}

