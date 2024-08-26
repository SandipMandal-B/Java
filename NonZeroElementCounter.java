public class NonZeroElementCounter {
    public static void main(String[] args) {
        int[] array = {0, 5, 0, 10, 0, 15, 20};

        int count = 0;
        for (int num : array) {
            if (num != 0) {
                count++;
            }
        }

        System.out.println("Number of non-zero elements in the array: " + count);
    }
}
