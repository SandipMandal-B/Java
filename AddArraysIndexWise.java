import java.util.Arrays;

public class AddArraysIndexWise {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int length1 = array1.length;
        int length2 = array2.length;
        int maxLength = Math.max(length1, length2);

        int[] sumArray = new int[maxLength];

        // Add elements index-wise and store them into sumArray
        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < length1) ? array1[i] : 0;
            int num2 = (i < length2) ? array2[i] : 0;
            sumArray[i] = num1 + num2;
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Sum Array: " + Arrays.toString(sumArray));
    }
}
