package easy.Arrays.CheckIfSorted;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 5, 3, 3, 4 };
        System.out.println(ifSorted(arr)); 
    }

    static boolean ifSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
