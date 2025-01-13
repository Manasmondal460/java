// Program to demonstrate finding the largest and smallest elements in an array
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take array size input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 2: Initialize the array
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements:");

        // Step 3: Input elements into the array
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Initialize variables for min and max
        int min = numbers[0]; // Assume the first element is the smallest
        int max = numbers[0]; // Assume the first element is the largest

        // Step 5: Iterate through the array to find min and max
        for (int i = 1; i < size; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if a smaller element is found
            }
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger element is found
            }
        }

        // Step 6: Display the results
        System.out.println("Smallest element in the array: " + min);
        System.out.println("Largest element in the array: " + max);

        // Closing the scanner
        scanner.close();
    }
}
