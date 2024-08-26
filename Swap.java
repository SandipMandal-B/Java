import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to swap:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping logic
        double temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();
    }
}
