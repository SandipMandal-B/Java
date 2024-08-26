import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        // Greet the user with their name
        System.out.println("Hello, " + name + "! Nice to meet you.");

        scanner.close();
    }
}
