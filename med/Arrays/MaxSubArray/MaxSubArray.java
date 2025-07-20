package med.Arrays.MaxSubArray;

import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(findArray(nums));

    }

    static int findArray(int[] nums) {
        int result = nums[0];
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {

            System.out.println("Result is:" + result);
            System.out.println("Temp is: " + temp);
            temp = temp + nums[i];
            if (temp > result) {
                result = temp;
            }else{
                result = nums[i];
                temp = nums[i];
            }
            System.out.println("Result after updation:" + result);
            System.out.println("Temp after updation: " + temp);

        }
        return result;
    }
}
