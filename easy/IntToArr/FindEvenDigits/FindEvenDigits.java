package easy.IntToArr.FindEvenDigits;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindEvenDigits {
    public static void main(String[] args) {
        int[] nums = { 123, 4567, 22, -31, 00};

        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }

    static int digits(int num) {

        int count = 0;

        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            num = num * -1;
        }

        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;

    }

    static int digitsOpt(int num){
        return (int)(Math.log10(num))+1;
    }

    static boolean isEven(int num) {
        int numberOfDigits = digitsOpt(num);
        return numberOfDigits % 2 == 0;
    }

}