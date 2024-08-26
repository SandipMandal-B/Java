import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String reversedRecursive = reverseRecursive(inputString);
        String reversedIterative = reverseIterative(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String (Recursive): " + reversedRecursive);
        System.out.println("Reversed String (Iterative): " + reversedIterative);

        scanner.close();
    }

    // Method to reverse a string using recursion
    public static String reverseRecursive(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseRecursive(str.substring(1)) + str.charAt(0);
        }
    }

    // Method to reverse a string using iteration
    public static String reverseIterative(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
