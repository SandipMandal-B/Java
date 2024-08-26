import java.util.Scanner;

public class FirstLastOccurrence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the character to find:");
        char character = scanner.next().charAt(0);

        int firstOccurrence = inputString.indexOf(character);
        int lastOccurrence = inputString.lastIndexOf(character);

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + character + "' found at index: " + firstOccurrence);
        } else {
            System.out.println("Character '" + character + "' not found in the string.");
        }

        if (lastOccurrence != -1) {
            System.out.println("Last occurrence of '" + character + "' found at index: " + lastOccurrence);
        } else {
            System.out.println("Character '" + character + "' not found in the string.");
        }

        scanner.close();
    }
}
