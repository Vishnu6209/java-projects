import java.util.*;

public class LongestUniqueSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        LongestUniqueSubstring obj = new LongestUniqueSubstring();
        String input = "abcabcbb";
        System.out.println("Length of longest substring: " + obj.lengthOfLongestSubstring(input)); // Output: 3
    }
}
