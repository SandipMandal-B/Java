import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        
        boolean areEqual = compareStrings(firstString, secondString);
        
        if (areEqual) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        
        scanner.close();
    }
    
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}
