package easy.Arrays.RunningSum;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/description/

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static public int[] runningSum(int[] nums) {
        for(int i= 0; i<nums.length; i++){
            if(i>0){
            nums[i]= nums[i]+nums[i-1];
            }
        }
        return nums;
    }
}

