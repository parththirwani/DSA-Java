package easy.Arrays.Pangram;

public class Pangram {
    public static void main(String[] args) {
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";

        System.out.println(isPangram(sentence1)); // Output: true
        System.out.println(isPangram(sentence2)); // Output: false
    }

    static boolean isPangram(String sentence) {
        boolean[] seen = new boolean[26];
        int uniqueCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            int index = ch - 'a';

            if (!seen[index]) {
                seen[index] = true;
                uniqueCount++;

                if (uniqueCount == 26) {
                    return true; // Early exit when all letters are found
                }
            }
        }

        return false; // Not all 26 letters were seen
    }

}
