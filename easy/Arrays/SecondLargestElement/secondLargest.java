package easy.Arrays.SecondLargestElement;

//o(n)


public class secondLargest {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,4,7,7,5};
        System.out.println(secondLargestElement(nums));
    }

    static int secondLargestElement(int[] nums) {
        int largest = nums[0];
        int slaregest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                slaregest = largest;
                largest = nums[i];
            }
            if(nums[i]<largest && nums[i]>slaregest){
                slaregest = nums[i];
            }

            if(nums[i] == largest){

            }
        }
        return slaregest;
    }
}
