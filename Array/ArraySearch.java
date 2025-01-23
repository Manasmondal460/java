/*
 * Explanation:
 * 
 * Objective: Write a Java program to check if an array contains a given element and return its index if found.
 * 
 * Steps:
 * 1. Initialize an array with some elements.
 * 2. Create a method to search for the element in the array.
 * 3. Print the index of the element if found, or indicate that the element is not present in the array.
 */

public class ArraySearch {

    public static void main(String[] args) {
        // Step 1: Initialize an array with some elements
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3; // Element to search for

        // Step 3: Print the index of the element if found, or indicate that the element is not present
        int index = searchElement(numbers, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    // Step 2: Method to search for the element in the array
    public static int searchElement(int[] array, int target) {
        // Traverse the array to search for the target element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}

