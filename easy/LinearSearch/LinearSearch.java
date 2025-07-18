package easy.LinearSearch;

public class LinearSearch {
    public int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i; // Target found, return the index
            }
        }
        return -1; // Target not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 5;

        LinearSearch ls = new LinearSearch();
        int result = ls.search(arr, target);
        System.out.println("Index of target: " + result); 
    }
}
