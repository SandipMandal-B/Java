import java.util.Scanner;

public class CheckCharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter the index to check: ");
        int index = scanner.nextInt();
        
        boolean isCharAtIndex = isCharAtIndex(inputString, index);
        
        if (isCharAtIndex) {
            System.out.println("The character exists at index " + index);
        } else {
            System.out.println("The character does not exist at index " + index);
        }
        
        scanner.close();
    }
    
    public static boolean isCharAtIndex(String str, int index) {
        return index >= 0 && index < str.length();
    }
}
