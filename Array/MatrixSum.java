public class MatrixSum {

    public static void main(String[] args) {
        // Initialize a 2D array (matrix) with some elements
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate the sum of all elements in the matrix
        int sum = calculateSum(matrix);
        System.out.println("Sum of Elements: " + sum);
    }

    // Method to calculate the sum of all elements in the matrix
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        // Iterate through each row of the matrix
        for (int[] row : matrix) {
            // Iterate through each element in the row
            for (int element : row) {
                // Add the element to the sum
                sum += element;
            }
        }
        return sum;
    }
}
