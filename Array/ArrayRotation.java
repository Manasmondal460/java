/*
 * Explanation:
 * 
 * Objective: Write a Java program to rotate the elements of an array to the right by a specified number of positions.
 * 
 * Steps:
 * 1. Initialize an array with some elements.
 * 2. Create a method to rotate the array elements to the right.
 * 3. Print the rotated array.
 */

public class ArrayRotation {

    public static void main(String[] args) {
        // Step 1: Initialize an array with some elements
        int[] numbers = {1, 2, 3, 4, 5};
        int positions = 2; // Number of positions to rotate

        // Step 3: Print the rotated array
        int[] rotatedArray = rotateArray(numbers, positions);
        System.out.println("Rotated Array:");
        printArray(rotatedArray);
    }

    // Step 2: Method to rotate the array elements to the right
    public static int[] rotateArray(int[] array, int positions) {
        int length = array.length;
        int[] rotatedArray = new int[length];

        // Rotate the elements to the right by the specified number of positions
        for (int i = 0; i < length; i++) {
            rotatedArray[(i + positions) % length] = array[i];
        }

        return rotatedArray;
    }

    // Method to print the elements of an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
