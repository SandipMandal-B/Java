import java.util.Scanner;

public class UpperCaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String upperCaseString = convertToUpperCase(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("String in Upper Case: " + upperCaseString);

        scanner.close();
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }
}
