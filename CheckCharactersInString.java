import java.util.Scanner;

public class CheckCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        boolean allCharactersPresent = checkCharacters(firstString, secondString);

        if (allCharactersPresent) {
            System.out.println("All characters in the first string are present in the second string.");
        } else {
            System.out.println("Not all characters in the first string are present in the second string.");
        }

        scanner.close();
    }

    public static boolean checkCharacters(String str1, String str2) {
        for (char ch : str1.toCharArray()) {
            if (str2.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
