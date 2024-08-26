import java.util.Scanner;

public class CharacterFrequencyAndPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the character to find:");
        char characterToFind = scanner.next().charAt(0);

        // Count frequency and find position of occurrence
        int frequency = 0;
        int position = -1;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == characterToFind) {
                frequency++;
                if (position == -1) {
                    position = i;
                }
            }
        }

        if (frequency > 0) {
            System.out.println("Character '" + characterToFind + "' is present in the string.");
            System.out.println("Frequency of occurrence: " + frequency);
            System.out.println("Position of first occurrence: " + position);
        } else {
            System.out.println("Character '" + characterToFind + "' is not present in the string.");
        }

        scanner.close();
    }
}
