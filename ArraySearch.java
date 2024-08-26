import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 20, 30, 40, 50};

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}
