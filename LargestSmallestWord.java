import java.util.Scanner;

public class LargestSmallestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+");
        String largestWord = "";
        String smallestWord = "";

        if (words.length > 0) {
            largestWord = words[0];
            smallestWord = words[0];

            for (int i = 1; i < words.length; i++) {
                if (words[i].length() > largestWord.length()) {
                    largestWord = words[i];
                }
                if (words[i].length() < smallestWord.length()) {
                    smallestWord = words[i];
                }
            }
        }

        System.out.println("Largest Word: " + largestWord);
        System.out.println("Smallest Word: " + smallestWord);

        scanner.close();
    }
}
