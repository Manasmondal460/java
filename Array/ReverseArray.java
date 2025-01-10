import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        // Step 1: Create an array of size 5
        int a[] = new int[5];

        // Step 2: Prompt user to input array elements
        System.out.println("Enter your array elements ----->");
        Scanner r = new Scanner(System.in);

        // Step 3: Use a loop to take input from the user and store it in the array
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(); // Input each element
        }

        // Step 4: Display the array elements in original order
        System.out.println("Array elements are ----->");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // Print each element
        }

        // Step 5: Display the array elements in reverse order
        System.out.println("Reverse array elements are ----->");
        for (int i = a.length - 1; i >= 0; i--) { // Start from the last index
            System.out.println(a[i]); // Print each element in reverse order
        }

        // Close the scanner 
        r.close();
    }
}
