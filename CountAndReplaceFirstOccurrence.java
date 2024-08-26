import java.util.Scanner;

public class CountAndReplaceFirstOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string:");
        String originalString = scanner.nextLine();

        System.out.println("Enter the substring to replace:");
        String substring = scanner.nextLine();

        System.out.println("Enter the replacement string:");
        String replacement = scanner.nextLine();

        int count = countAndReplaceFirstOccurrence(originalString, substring, replacement);

        System.out.println("Modified String: " + originalString);
        System.out.println("Number of replacements made: " + count);

        scanner.close();
    }

    public static int countAndReplaceFirstOccurrence(String str, String substr, String replacement) {
        int count = 0;
        int index = str.indexOf(substr);
        
        if (index != -1) {
            count++;
            String modifiedString = str.substring(0, index) + replacement + str.substring(index + substr.length());
            System.out.println("String after replacement: " + modifiedString);
        }

        return count;
    }
}
