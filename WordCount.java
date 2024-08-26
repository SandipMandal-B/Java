import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input text or sentence
        System.out.println("Enter a text or sentence:");
        String text = scanner.nextLine();

        // Count the number of words
        int wordCount = countWords(text);

        // Display the result
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }

    public static int countWords(String text) {
        // Split the text into words using whitespace as delimiter
        String[] words = text.split("\\s+");
        
        // Return the number of words
        return words.length;
    }
}
