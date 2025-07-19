package easy.Arrays.DiagnolSum;

public class DiagnolSum {
    public static void main(String[] args) {
        int[][] mat = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Sum: " + checkDiagnolSum(mat));
    }

    static int checkDiagnolSum(int[][] mat) {
        int n = mat.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Adding primary diagonal: " + mat[i][i]);
            result += mat[i][i];

            if (i != n - 1 - i) { 
                System.out.println("Adding secondary diagonal: " + mat[i][n - 1 - i]);
                result += mat[i][n - 1 - i];
            }
        }

        return result;
    }
}
