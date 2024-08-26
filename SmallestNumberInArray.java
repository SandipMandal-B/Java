import java.util.Scanner;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input elements into the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the smallest number in the array
        int smallest = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("The smallest number in the array is: " + smallest);

        scanner.close();
    }
}
