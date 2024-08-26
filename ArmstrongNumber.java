import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        // Assigning original value to variable originalNumber
        originalNumber = number;

        // Calculating number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        // Assigning original value to variable originalNumber
        originalNumber = number;

        // Finding Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Checking if number is Armstrong or not
        return result == number;
    }
}
