import java.util.Scanner;

public class RemoveCharacters2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        String removedString = removeCharacters(firstString, secondString);

        System.out.println("First String: " + firstString);
        System.out.println("Second String: " + secondString);
        System.out.println("Second String with characters from First String removed: " + removedString);

        scanner.close();
    }

    public static String removeCharacters(String first, String second) {
        StringBuilder result = new StringBuilder();

        for (char ch : second.toCharArray()) {
            if (first.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
