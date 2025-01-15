public class SecondLargestElement {

    public static void main(String[] args) {
        // Initialize an array with some elements
        int[] numbers = {5, 1, 9, 2, 8, 3, 7};

        // Find the second largest element in the array
        int secondLargest = findSecondLargest(numbers);
        System.out.println("Second Largest Element: " + secondLargest);
    }

    // Method to find the second largest element in the array
    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the largest and second largest elements
        for (int num : array) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
