/*
 * Explanation:
 * 
 * Objective: Write a Java program to demonstrate the usage of the `while` loop by calculating the factorial of a number.
 * 
 * Steps:
 * 1. Initialize a counter variable and a variable to store the factorial result.
 * 2. Create a `while` loop to multiply the counter value to the factorial result and decrement the counter.
 * 3. Continue the loop until the counter reaches 1.
 * 4. Print the calculated factorial.
 */

public class WhileLoopExample {

    public static void main(String[] args) {
        // Step 1: Initialize a counter variable and a variable to store the factorial result
        int number = 5; // Number to calculate the factorial of
        int factorial = 1;
        int counter = number;

        // Step 2: Create a `while` loop
        while (counter > 0) {
            // Multiply the current value of the counter to the factorial result
            factorial *= counter;

            // Decrement the counter
            counter--;
        }

        // Step 4: Print the calculated factorial
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
