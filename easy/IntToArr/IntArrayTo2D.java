package easy.IntToArr;

public class IntArrayTo2D {
    public static void main(String[] args) {
        int[] input = {7, 10, 24, 35};
        int[][] result = to2DDigitArray(input);

        // Print the result
        for (int[] row : result) {
            for (int digit : row) {
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }

    public static int[][] to2DDigitArray(int[] arr) {
        int[][] result = new int[arr.length][];
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            // Count digits
            int temp = num;
            int count = (num == 0) ? 1 : 0;
            while (temp > 0) {
                temp /= 10;
                count++;
            }

            // Extract digits
            int[] digits = new int[count];
            for (int j = count - 1; j >= 0; j--) {
                digits[j] = num % 10;
                num /= 10;
            }

            result[i] = digits;
        }

        return result;
    }
}

