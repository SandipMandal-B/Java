import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string:");
        String originalString = scanner.nextLine();

        System.out.println("Enter the substring to replace:");
        String oldSubstring = scanner.nextLine();

        System.out.println("Enter the new substring:");
        String newSubstring = scanner.nextLine();

        String modifiedString = replaceSubstring(originalString, oldSubstring, newSubstring);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    public static String replaceSubstring(String str, String oldSubstring, String newSubstring) {
        return str.replace(oldSubstring, newSubstring);
    }
}
