package easy.Arrays.smallerNumberThanCurr;

import java.util.Arrays;

public class smallerNumberThanCurr {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101]; // step 1: frequency array

        // Count frequency of each number
        for (int num : nums) {
            freq[num]++;
        }

        // Prefix sum array: how many numbers are smaller than i
        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i - 1];
        }

        // Build the result using prefix sums
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            result[i] = num == 0 ? 0 : freq[num - 1];
        }

        return result;
    }
}
