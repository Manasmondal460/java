/*
 * Explanation:
 * 
 * Objective: Write a Java program to demonstrate the usage of the `do-while` loop.
 * 
 * Steps:
 * 1. Initialize a counter variable.
 * 2. Create a `do-while` loop to print the counter value and increment it.
 * 3. Continue the loop until the counter reaches a specified limit.
 */

public class DoWhileLoopExample {

    public static void main(String[] args) {
        // Step 1: Initialize a counter variable
        int counter = 1;
        int limit = 5; // Specify the limit for the loop

        // Step 2: Create a `do-while` loop
        do {
            // Print the current value of the counter
            System.out.println("Counter: " + counter);

            // Increment the counter
            counter++;
        } while (counter <= limit); // Step 3: Continue the loop until the counter reaches the limit
    }
}
