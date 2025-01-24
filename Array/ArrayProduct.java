/*
 * Explanation:
 * 
 * Objective: Write a Java program to calculate the product of all elements in an array.
 * 
 * Steps:
 * 1. Initialize an array with some elements.
 * 2. Create a method to calculate the product of all elements in the array.
 * 3. Print the product of the elements.
 */

public class ArrayProduct {

    public static void main(String[] args) {
        // Step 1: Initialize an array with some elements
        int[] numbers = {1, 2, 3, 4, 5};

        // Step 3: Print the product of the elements
        long product = calculateProduct(numbers);
        System.out.println("Product of Elements: " + product);
    }

    // Step 2: Method to calculate the product of all elements in the array
    public static long calculateProduct(int[] array) {
        long product = 1; // Initialize the product to 1 (multiplicative identity)
        for (int num : array) {
            product *= num; // Multiply each element to the product
        }
        return product;
    }
}
