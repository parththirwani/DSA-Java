package easy.LinearSearch;

import java.util.Arrays;

public class Linear2DSearch {
    public static void main(String[] args) {
        int[][] arr= {
            {2,1,3,4},
            {9,7,4},
            {15,29,36}
        };

        int target = 4;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        

    }
    static int[] search (int [][] arr, int target){
        for (int row=0; row<arr.length; row++){
            for (int col=0; col< arr[row].length; col++){
                if (target == arr[row][col]){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
