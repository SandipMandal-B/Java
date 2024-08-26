import java.util.HashMap;
import java.util.Map;

public class DuplicateFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 9, 9};

        // Map to store element and its frequency
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each element
        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        // Print duplicates and their frequencies
        System.out.println("Duplicate elements and their frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }
    }
}
