import java.util.Scanner;

public class WordGroupCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Group of words to count
        System.out.println("Enter the group of words to count (separated by spaces):");
        String groupOfWords = scanner.nextLine();

        // Count occurrences of the group of words
        int count = countWordGroup(inputString, groupOfWords);

        // Display the result
        System.out.println("Number of occurrences of the group of words: " + count);

        scanner.close();
    }

    public static int countWordGroup(String str, String groupOfWords) {
        // Split the input string into words
        String[] words = str.split("\\s+");
        
        // Split the group of words into individual words
        String[] groupWords = groupOfWords.split("\\s+");

        int count = 0;

        // Iterate through the words in the input string
        for (int i = 0; i <= words.length - groupWords.length; i++) {
            boolean found = true;

            // Check if the current group of words matches the group to count
            for (int j = 0; j < groupWords.length; j++) {
                if (!words[i + j].equals(groupWords[j])) {
                    found = false;
                    break;
                }
            }

            // If the group of words is found, increment the count
            if (found) {
                count++;
            }
        }

        return count;
    }
}
