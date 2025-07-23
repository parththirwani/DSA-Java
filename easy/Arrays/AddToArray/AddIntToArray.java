package easy.Arrays.AddToArray;

import java.util.Arrays;

public class AddIntToArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 0, 7 };
        int k = 34;
        int num = convertToInt(arr);
        int result = addInt(num, k);
        System.out.println(num);
        System.out.println(result);
        System.out.println(Arrays.toString(convertToArr(result)));
    }

    public static int convertToInt(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = (num * 10) + arr[i];
        }
        return num;
    }

    public static int addInt(int num, int k){
        num = num +k;
        return num;
    }

    public static int[] convertToArr(int num){
        int count =0;
        int temp = num;
        while (temp!=0){
            temp= temp/10;
            count++;
        }

        int[] arr = new int[count];

        int rem =0;

        for(int i=arr.length-1; i>=0;i--){
            rem = num%10;
            num = num/10;
            arr[i] = rem;
        }
        return arr;
    }


}