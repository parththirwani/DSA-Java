package easy.Arrays.plusOne;

//https://leetcode.com/problems/plus-one/description/

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = { 9, 9, 9, 9 };
        System.out.println(Arrays.toString(addOne(digits)));
    }

    public static int[] addOne(int[] digits) {
        int end = digits.length - 1;

        digits[end] = digits[end] + 1;

        for (int i = end; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            }
        }

        if (digits[0] == 10) {
            digits[0] = 0;
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }
}