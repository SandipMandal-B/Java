public class SparseMatrixChecker {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        boolean isSparse = true;

        // Iterate through the matrix to check if any non-zero element exists
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    isSparse = false;
                    break;
                }
            }
            if (!isSparse) {
                break;
            }
        }

        if (isSparse) {
            System.out.println("The matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");
        }
    }
}
