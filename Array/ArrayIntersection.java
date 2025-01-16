import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static void main(String[] args) {
        // Initialize two arrays with some elements
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Find the intersection of the two arrays
        int[] intersection = findIntersection(array1, array2);

        // Print the intersection array
        System.out.println("Intersection of Arrays:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    // Method to find the intersection of two arrays
    public static int[] findIntersection(int[] array1, int[] array2) {
        // Create a set to store elements of the first array
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        // Create a list to store the intersection elements
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : array2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the set to an array
        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }

        return intersection;
    }
}
