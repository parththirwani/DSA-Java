package easy.Arrays.HighestAlt;

//https://leetcode.com/problems/find-the-highest-altitude/

public class HighestAltitiude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(findHighestAlt(gain));
    }

    static int findHighestAlt(int[] gain) {
        int[] alt = new int[gain.length + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < alt.length; i++) {

            if (i == 0) {
                alt[0] = 0;
            } else {
                alt[i] = alt[i-1] + gain[i-1];
            }

            if(alt[i]>max){
                max = alt[i];
            }
        }
        return max;
    }
}
