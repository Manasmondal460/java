/*
 * Explanation:
 * 
 * Objective: Write a Java program to find the pair of elements in an array whose sum is closest to zero.
 * 
 * Steps:
 * 1. Initialize an array with some elements.
 * 2. Create a method to find the pair of elements with the sum closest to zero.
 * 3. Print the pair of elements and their sum.
 */

public class ClosestToZeroSum {

    public static void main(String[] args) {
        // Step 1: Initialize an array with some elements
        int[] numbers = {1, 60, -10, 70, -80, 85};

        // Step 3: Print the pair of elements and their sum
        int[] result = findClosestToZeroSum(numbers);
        System.out.println("Pair of elements with the sum closest to zero: " + result[0] + " and " + result[1]);
        System.out.println("Sum: " + (result[0] + result[1]));
    }

    // Step 2: Method to find the pair of elements with the sum closest to zero
    public static int[] findClosestToZeroSum(int[] array) {
        int n = array.length;
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int minSum = Integer.MAX_VALUE;
        int[] pair = new int[2];

        // Find the pair of elements whose sum is closest to zero
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = array[i] + array[j];
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    pair[0] = array[i];
                    pair[1] = array[j];
                }
            }
        }

        return pair;
    }
}
