import java.util.Scanner;

public class SearchParticularWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        System.out.println("Enter the word to search:");
        String wordToSearch = scanner.nextLine();

        boolean found = searchWord(mainString, wordToSearch);

        if (found) {
            System.out.println("Word \"" + wordToSearch + "\" found in the main string.");
        } else {
            System.out.println("Word \"" + wordToSearch + "\" not found in the main string.");
        }

        scanner.close();
    }

    public static boolean searchWord(String str, String word) {
        // Split the string by spaces and check if the word is present
        String[] words = str.split(" ");
        for (String w : words) {
            if (w.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
