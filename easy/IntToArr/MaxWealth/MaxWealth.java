package easy.IntToArr.MaxWealth;

public class MaxWealth {
    public static void main(String[] args) {
        int num [][] = {
            {1,2,3},
            {3,2,1},
            {1,8},
            {0},
            {-2}
        };
        System.out.println(compareWealth(num));

    }

    static int compareWealth(int accounts[][]) {
        int max = Integer.MIN_VALUE;

        for (int rows = 0; rows < accounts.length; rows++) {
            int result = 0;
            for (int cols = 0; cols < accounts[rows].length; cols++) {
                result += accounts[rows][cols]; 
            }

            if(result>max){
                max= result;
            }
        }
        return max;
    }
}
