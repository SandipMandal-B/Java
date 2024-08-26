import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int hcf = findHCF(num1, num2);
        
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        
        scanner.close();
    }
    
    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
