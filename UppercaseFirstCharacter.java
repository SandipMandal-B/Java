import java.util.Scanner;

public class UppercaseFirstCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String modifiedString = uppercaseFirstCharacter(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    public static String uppercaseFirstCharacter(String str) {
        StringBuilder result = new StringBuilder(str.length());
        String[] words = str.split("\\s");

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
                result.append(" ");
            }
        }

        return result.toString().trim();
    }
}
