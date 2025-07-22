package easy.Arrays.TransposeOfMatrix;

public class transposeMatrix {
    public static void main(String[] args) {
        int[][] mat = new int[][] {
                { 2, 4, -1 },
                { -10, 5, 11 },
                { 18, -7, 6 }
        };

        int[][] transposed = transpose(mat);

        System.out.println("Transposed Matrix:");
        printMatrix(transposed);

    }

    static int[][] transpose(int[][] mat) {

        for (int row = 0; row < mat.length; row++) {
            for (int col = row+1; col < mat[row].length; col++) {

                int temp = mat[col][row];
                mat[col][row] = mat[row][col];
                mat[row][col] = temp;
            }

        }
        return mat;

    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t"); // tab-separated
            }
            System.out.println();
        }
    }
}
