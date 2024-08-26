import java.util.Scanner;

public class LastOccurrenceSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        System.out.println("Enter the substring to search:");
        String subString = scanner.nextLine();

        int lastIndex = mainString.lastIndexOf(subString);

        if (lastIndex != -1) {
            System.out.println("Last occurrence of \"" + subString + "\" found at index: " + lastIndex);
        } else {
            System.out.println("Substring \"" + subString + "\" not found in the main string.");
        }

        scanner.close();
    }
}
