package easy.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] == arr[end]) {
            return start;
        }

        if (arr[start] > arr[end]) {

            while (start <= end) {
                // int middle = (start+end)/2; unoptimized start+end may go out of range

                int middle = start + (end - start) / 2;

                if (target > arr[middle]) {
                    end = middle - 1;
                } else if (target < arr[middle]) {

                    start = middle + 1;
                } else {
                    return middle;
                }
            }

        }
        if (arr[start] < arr[end]) {
            while (start <= end) {
                // int middle = (start+end)/2; unoptimized start+end may go out of range

                int middle = start + (end - start) / 2;
                if (target > arr[middle]) {
                    start = middle + 1;
                } else if (target < arr[middle]) {
                    end = middle - 1;
                } else {
                    return middle;
                }
            }
        }

        return -1;
    }
}
