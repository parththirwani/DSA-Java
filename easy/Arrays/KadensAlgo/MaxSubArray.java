import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = { 1 };
        int[] subarray = findMaxSubArray(arr);
        System.out.println("Subarray: " + Arrays.toString(subarray));
        System.out.println(findMaxSum(arr));
    }

    static int[] findMaxSubArray(int[] arr) {
        int maxSum = 0;
        int currentSum = arr[0];
        int startSubArray = 0;
        int endSubArray = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                startSubArray = tempStart;
                endSubArray = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        return Arrays.copyOfRange(arr, startSubArray, endSubArray + 1);
    }

    static int findMaxSum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

}
