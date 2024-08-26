import java.util.HashMap;
import java.util.Scanner;

public class CountCharacterOccurrencesIgnoringCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        HashMap<Character, Integer> charCountMap = countCharacterOccurrencesIgnoringCase(inputString);

        System.out.println("Character occurrences (ignoring case):");
        for (char ch : charCountMap.keySet()) {
            System.out.println("'" + ch + "': " + charCountMap.get(ch));
        }

        scanner.close();
    }

    public static HashMap<Character, Integer> countCharacterOccurrencesIgnoringCase(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            // Convert character to lowercase to ignore case
            char lowercaseChar = Character.toLowerCase(ch);
            // Update character count
            if (Character.isLetter(lowercaseChar)) {
                charCountMap.put(lowercaseChar, charCountMap.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

        return charCountMap;
    }
}
