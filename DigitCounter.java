import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + digitCount);

        scanner.close();
    }

    public static int countDigits(int number) {
        // Convert number to positive if it's negative
        number = Math.abs(number);

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
