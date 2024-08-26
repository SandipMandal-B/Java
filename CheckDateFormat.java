import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckDateFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (in dd/MM/yyyy format):");
        String dateString = scanner.nextLine();

        boolean isValidFormat = isValidDateFormat(dateString);

        if (isValidFormat) {
            System.out.println("The date is in proper format.");
        } else {
            System.out.println("The date is not in proper format.");
        }

        scanner.close();
    }

    public static boolean isValidDateFormat(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            Date date = dateFormat.parse(dateString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
