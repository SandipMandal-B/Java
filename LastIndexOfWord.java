import java.util.Scanner;

public class LastIndexOfWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        System.out.println("Enter the word to find:");
        String wordToFind = scanner.nextLine();

        int lastIndex = lastIndexOfWord(mainString, wordToFind);

        if (lastIndex != -1) {
            System.out.println("Last index of \"" + wordToFind + "\" found at index: " + lastIndex);
        } else {
            System.out.println("Word \"" + wordToFind + "\" not found in the main string.");
        }

        scanner.close();
    }

    public static int lastIndexOfWord(String str, String word) {
        String[] words = str.split("\\s");
        int lastIndex = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }
}
