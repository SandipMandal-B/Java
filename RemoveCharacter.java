import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string:");
        String originalString = scanner.nextLine();

        System.out.println("Enter the character to remove:");
        char charToRemove = scanner.next().charAt(0);

        String modifiedString = removeCharacter(originalString, charToRemove);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != charToRemove) {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }
}
