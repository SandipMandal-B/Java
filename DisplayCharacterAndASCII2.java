import java.util.Scanner;

public class DisplayCharacterAndASCII2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        System.out.println("Characters and their corresponding ASCII values:");

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            int asciiValue = (int) character;
            System.out.println("Character: " + character + ", ASCII Value: " + asciiValue);
        }

        scanner.close();
    }
}
