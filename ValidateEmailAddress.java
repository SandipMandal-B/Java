import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an email address:");
        String emailAddress = scanner.nextLine();

        boolean isValid = isValidEmailFormat(emailAddress);

        if (isValid) {
            System.out.println("The email address is in valid format.");
        } else {
            System.out.println("The email address is not in valid format.");
        }

        scanner.close();
    }

    public static boolean isValidEmailFormat(String emailAddress) {
        // Regular expression for email address format
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(emailAddress);

        return matcher.matches();
    }
}
