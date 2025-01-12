import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        // Step 1: Create an array and take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt(); // Size of the array

        int[] arr = new int[n]; // Create an array of size 'n'

        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Take input for each element
        }

        // Step 2: Find the maximum and minimum element in the array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
            if (arr[i] < min) {
                min = arr[i]; // Update min if current element is smaller
            }
        }

        // Step 3: Reverse the array
        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " "); // Print elements in reverse order
        }
        System.out.println();

        // Step 4: Display the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        // Close the scanner
        sc.close();
    }
}
