import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeleteRepeatedWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String modifiedString = deleteRepeatedWords(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    public static String deleteRepeatedWords(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s+"); // Split the string by whitespace

        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                result.append(word).append(" ");
                uniqueWords.add(word);
            }
        }

        return result.toString().trim();
    }
}
