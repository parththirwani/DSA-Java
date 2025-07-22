import java.util.Arrays;

public class rotationOfMatrix {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int rotationCount= 2;

        System.out.println(Arrays.toString(rotateMatrix(arr, rotationCount)));
    }

    static int[] rotateMatrix(int[] arr, int rotationCount) {
        int end = arr.length - 1;
        int rc = 0;

        while(rc<rotationCount){
            int temp = arr[0];
            for(int i=0; i<end; i++){
                arr[i]= arr[i+1];
            }
            arr[end]= temp;
            rc++;
        }
        return arr;
    }
}