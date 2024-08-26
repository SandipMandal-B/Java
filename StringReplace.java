import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string:");
        String originalString = scanner.nextLine();

        System.out.println("Enter the string/character to replace:");
        String toReplace = scanner.nextLine();

        System.out.println("Enter the replacement string/character:");
        String replacement = scanner.nextLine();

        String replacedString = originalString.replace(toReplace, replacement);

        System.out.println("Original String: " + originalString);
        System.out.println("Replaced String: " + replacedString);

        scanner.close();
    }
}
