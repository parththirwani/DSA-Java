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
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] finalMat = new int[cols][rows];

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {

                finalMat[col][row] = mat[row][col];
            }
        }
        return finalMat;

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
