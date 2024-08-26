import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string with white spaces: ");
        String inputString = scanner.nextLine();
        
        String stringWithoutSpaces = removeWhiteSpaces(inputString);
        
        System.out.println("String without white spaces: " + stringWithoutSpaces);
        
        scanner.close();
    }
    
    public static String removeWhiteSpaces(String str) {
        return str.replaceAll("\\s", "");
    }
}
