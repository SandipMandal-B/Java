public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Original array:");
        printArray(array);

        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

        System.out.println("Reversed array:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
