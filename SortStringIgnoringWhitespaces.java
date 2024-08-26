import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SortStringIgnoringWhitespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String sortedString = sortStringIgnoringWhitespaces(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);

        scanner.close();
    }

    public static String sortStringIgnoringWhitespaces(String str) {
        // Remove whitespaces
        str = str.replaceAll("\\s+", "");

        // Convert string to character array and sort it
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        // Remove repeating characters
        Set<Character> charSet = new LinkedHashSet<>();
        for (char ch : charArray) {
            charSet.add(ch);
        }

        // Construct the sorted string
        StringBuilder sortedBuilder = new StringBuilder();
        for (char ch : charSet) {
            sortedBuilder.append(ch);
        }

        return sortedBuilder.toString();
    }
}
