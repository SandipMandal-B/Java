import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number for which you want to generate the multiplication table: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the number of rows for the table: ");
        int rows = scanner.nextInt();
        
        System.out.println("Multiplication table for " + number + ":");
        
        for (int i = 1; i <= rows; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        scanner.close();
    }
}