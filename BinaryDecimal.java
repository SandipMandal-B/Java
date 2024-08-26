import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                binaryToDecimal();
                break;
            case 2:
                decimalToBinary();
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
    
    public static void binaryToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        
        int decimal = Integer.parseInt(binaryString, 2);
        
        System.out.println("Decimal equivalent: " + decimal);
    }
    
    public static void decimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        String binaryString = Integer.toBinaryString(decimal);
        
        System.out.println("Binary equivalent: " + binaryString);
    }
}
