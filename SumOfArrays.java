import java.util.Arrays;

public class SumOfArrays {
    public static void main(String[] args) {
        int[][] array1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] array2 = { {7, 8, 9}, {10, 11, 12} };

        int rows = array1.length;
        int columns = array1[0].length;

        int[][] sum = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Sum of the two arrays:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(sum[i]));
        }
    }
}
