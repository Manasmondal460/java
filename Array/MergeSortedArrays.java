/*
 * Question:
 * Write a Java program to merge two sorted arrays into a single sorted array.
 * 
 * Steps:
 * 1. Initialize two sorted arrays.
 * 2. Create a method to merge the two sorted arrays into a single sorted array.
 * 3. Print the merged sorted array.
 */

public class MergeSortedArrays {

    public static void main(String[] args) {
        // Step 1: Initialize two sorted arrays
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        // Step 3: Print the merged sorted array
        int[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Merged Sorted Array:");
        printArray(mergedArray);
    }

    // Step 2: Method to merge two sorted arrays into a single sorted array
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        // Traverse both arrays and merge them in sorted order
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy remaining elements of array1, if any
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements of array2, if any
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }

    // Method to print the elements of an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
