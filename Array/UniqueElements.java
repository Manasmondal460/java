/*
 * Explanation:
 * 
 * Objective: Write a Java program to find the unique elements in an array.
 * 
 * Steps:
 * 1. Initialize an array with some elements, including duplicates.
 * 2. Create a method to find the unique elements in the array using a HashSet.
 * 3. Print the unique elements.
 */

// Import necessary classes
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

    public static void main(String[] args) {
        // Step 1: Initialize an array with some elements, including duplicates
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        // Step 3: Print the unique elements
        int[] uniqueNumbers = findUniqueElements(numbers);
        System.out.println("Unique Elements:");
        printArray(uniqueNumbers);
    }

    // Step 2: Method to find the unique elements in the array
    public static int[] findUniqueElements(int[] array) {
        // Use a Set to store unique elements
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }

        // Convert the Set to an array
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

    // Method to print the elements of an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
