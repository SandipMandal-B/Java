import java.util.Scanner;

public class Exponential{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        double result = calculateExponential(base, exponent);
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
    
    public static double calculateExponential(double base, int exponent) {
        double result = 1.0;
        
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        
        if (exponent < 0) {
            result = 1 / result;
        }
        
        return result;
    }
}
