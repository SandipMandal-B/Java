import java.util.Scanner;

public class ReplaceAllOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string:");
        String originalString = scanner.nextLine();

        System.out.println("Enter the string to replace:");
        String toReplace = scanner.nextLine();

        System.out.println("Enter the replacement string:");
        String replacement = scanner.nextLine();

        String replacedString = replaceAllOccurrences(originalString, toReplace, replacement);

        System.out.println("Original String: " + originalString);
        System.out.println("Replaced String: " + replacedString);

        scanner.close();
    }

    public static String replaceAllOccurrences(String str, String toReplace, String replacement) {
        return str.replaceAll(toReplace, replacement);
    }
}
