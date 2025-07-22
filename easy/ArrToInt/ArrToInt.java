package easy.ArrToInt;

public class ArrToInt {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4};
        System.out.println(convert(arr));  // Output: 1234
    }

    static int convert(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        return num;
    }
}
