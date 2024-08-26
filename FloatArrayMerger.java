import java.util.Arrays;

public class FloatArrayMerger {
    public static void main(String[] args) {
        float[] array1 = {1.1f, 2.2f, 3.3f};
        float[] array2 = {4.4f, 5.5f, 6.6f};

        int length1 = array1.length;
        int length2 = array2.length;
        int mergedLength = length1 + length2;

        float[] mergedArray = new float[mergedLength];

        // Copy elements of array1 to mergedArray
        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements of array2 to mergedArray
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
