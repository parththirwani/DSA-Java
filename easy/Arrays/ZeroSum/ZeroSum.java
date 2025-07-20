package easy.Arrays.ZeroSum;

import java.util.Arrays;

//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

public class ZeroSum {
    public static void main(String[] args) {
        int len = 5;  
        System.out.println(Arrays.toString(findNumbers(len)));
    }

    static int[] findNumbers(int len) {
        int[] arr = new int[len];
        int left = 0;
        int right = len - 1;
        int num = 1;

        while (left < right) {
            arr[left] = -num;
            arr[right] = num;
            left++;
            right--;
            num++;
        }
        
        return arr;
    }
}

