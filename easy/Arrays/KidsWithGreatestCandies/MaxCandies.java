package easy.Arrays.KidsWithGreatestCandies;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
    public static void main(String[] args) {

    }

     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
                int max = Integer.MIN_VALUE;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
    }
