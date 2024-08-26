import java.util.Scanner;

public class IndexOfCharacterOrString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        System.out.println("Enter the character or string to find:");
        String toFind = scanner.nextLine();

        int firstIndex = mainString.indexOf(toFind);
        int lastIndex = mainString.lastIndexOf(toFind);

        if (firstIndex != -1) {
            System.out.println("First occurrence of \"" + toFind + "\" found at index: " + firstIndex);
        } else {
            System.out.println("Character or string \"" + toFind + "\" not found in the main string.");
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence of \"" + toFind + "\" found at index: " + lastIndex);
        } else {
            System.out.println("Character or string \"" + toFind + "\" not found in the main string.");
        }

        scanner.close();
    }
}
