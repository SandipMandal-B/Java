import java.util.Scanner;

public class ConsecutiveVowelOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        int consecutiveCount = countConsecutiveVowels(inputString);

        System.out.println("Consecutive Occurrence of Any Vowel: " + consecutiveCount);

        scanner.close();
    }

    public static int countConsecutiveVowels(String str) {
        int consecutiveCount = 0;
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (isVowel(ch)) {
                vowelCount++;
                if (vowelCount > 1) {
                    consecutiveCount++;
                }
            } else {
                vowelCount = 0;
            }
        }

        return consecutiveCount;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
