package easy.TwoSum;

public class TwoSum {
    public void twoSum(int[] nums, int target) {
        outerloop: for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            System.out.println("Checking for target: " + target + " - nums[" + i + "] = " + needed);
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == needed && i != j) {
                    System.out.println("Pair found: " + nums[i] + " (index " + i + ") + " + nums[j] + " (index " + j + ")");
                    break outerloop;
                }
            }
        }
    }

    public static void main(String[] args) {
        TwoSum t1 = new TwoSum();
        t1.twoSum(new int[] {4, 5, 1, 8}, 9);
    }
}
