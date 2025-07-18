package easy.LinearSearch;


public class Max2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 7, 4, 9, 15 },
                { 2, 9, 10 },
                { 1, 2, 3, 4 }
        };

        int ans = maxIn2D(arr);
        System.out.println(ans);
    }

    static int maxIn2D(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }

            }

        }
        return max;
    }
}
