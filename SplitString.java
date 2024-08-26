import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the delimiter:");
        String delimiter = scanner.nextLine();

        String[] substrings = splitString(inputString, delimiter);

        System.out.println("Substrings:");
        for (String substring : substrings) {
            System.out.println(substring);
        }

        scanner.close();
    }

    public static String[] splitString(String str, String delimiter) {
        return str.split(delimiter);
    }
}
