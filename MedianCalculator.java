import java.util.Arrays;
import java.util.Scanner;

public class MedianCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double median = calculateMedian(numbers);
        System.out.println("Median of the numbers is: " + median);

        scanner.close();
    }

    public static double calculateMedian(double[] numbers) {
        Arrays.sort(numbers);

        if (numbers.length % 2 != 0) {
            return numbers[numbers.length / 2];
        } else {
            int middleIndex = numbers.length / 2;
            return (numbers[middleIndex - 1] + numbers[middleIndex]) / 2.0;
        }
    }
}
