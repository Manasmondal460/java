/*
 * Explanation:
 * 
 * Objective: Write a Java program to find the maximum sum of a contiguous subarray.
 * 
 * Steps:
 * 1. Initialize an array with some elements.
 * 2. Create a method to find the maximum subarray sum using Kadane's algorithm.
 * 3. Print the maximum subarray sum.
 */

public class MaxSubarraySum {

    public static void main(String[] args) {
        // Step 1: Initialize an array with some elements
        int[] numbers = {1, -2, 3, 4, -1, 2, 1, -5, 4};

        // Step 3: Print the maximum subarray sum
        int maxSum = findMaxSubarraySum(numbers);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    // Step 2: Method to find the maximum subarray sum using Kadane's algorithm
    public static int findMaxSubarraySum(int[] array) {
        int maxSoFar = array[0];
        int maxEndingHere = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
