public class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
        };

        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Matrix subtraction is not possible. Matrices must have the same dimensions.");
            return;
        }

        int[][] difference = new int[rows1][columns1];

        // Perform matrix subtraction
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Print the result
        System.out.println("Difference of the matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print(difference[i][j] + " ");
            }
            System.out.println();
        }
    }
}
