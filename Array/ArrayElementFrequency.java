import java.util.HashMap;
import java.util.Map;

public class ArrayElementFrequency {

    public static void main(String[] args) {
        // Initialize an array with some elements
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        // Find the frequency of each element in the array
        Map<Integer, Integer> frequencyMap = findFrequency(numbers);

        // Print the frequency of each element
        System.out.println("Element Frequency:");
        printFrequency(frequencyMap);
    }

    // Method to find the frequency of each element in the array
    public static Map<Integer, Integer> findFrequency(int[] array) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array
        for (int num : array) {
            // If the element is already in the map, increment its frequency
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the element is not in the map, add it with a frequency of 1
                frequencyMap.put(num, 1);
            }
        }

        return frequencyMap;
    }

    // Method to print the frequency of each element in the map
    public static void printFrequency(Map<Integer, Integer> frequencyMap) {
        // Iterate through the map and print each element and its frequency
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
