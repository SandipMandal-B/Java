public class SecondHighestElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 5, 15, 30};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second highest element in the array: " + secondMax);
    }
}
