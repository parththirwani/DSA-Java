package easy.Arrays.AddToArray;

import java.util.Arrays;

public class AddIntToArray {
    public static void main(String[] args) {
        // int k = 34;
        int[] num = new int[]{9,9,6,7};
        // int[] kArr = convertToArr(k);
        System.out.println(convertToInt(num));
        // System.out.println(Arrays.toString(convertToArr(k))); 

    }

    static int convertToInt(int[] arr){
        int num =0;
        for(int i=arr.length-1; i>=0; i--){
            int temp= arr[i]*(10^i);
            System.out.println("arr[i] is" +arr[i]);
            System.out.println("i");
            System.out.println("Temp is: "+temp);
            num =+ temp;
            System.out.println("Num is "+num);

        }
        return num;
        
    }

    static int[] convertToArr(int num) {
        if (num == 0) {
            return new int[]{0};
        }

        int temp = num;
        int count = 0;

        // Count number of digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int[] arr = new int[count];
        // Fill array from end to start
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num = num / 10;
        }

        return arr;
    }


}
