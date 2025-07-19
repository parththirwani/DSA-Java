package easy.Arrays.Concatenation;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/description/

public class Concatenation {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenatedArr(arr)));
    }

    static int[] getConcatenatedArr(int[] arr) {
        int[] conArr = new int[(2 * arr.length)];
        int start = 0;
        int end = conArr.length -1;

        int mid = end + (start-end)/2;

        for (int i = 0; i < arr.length; i++) {
            conArr[i] = arr[i];
            conArr[mid+i]= arr[i];
        }
        return conArr;
    }

}
