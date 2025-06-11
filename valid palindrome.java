public class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Main method to test
    public static void main(String[] args) {
        Solution sol = new Solution();

        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "No lemon, no melon";

        System.out.println("\"" + test1 + "\" is palindrome? " + sol.isPalindrome(test1)); // true
        System.out.println("\"" + test2 + "\" is palindrome? " + sol.isPalindrome(test2)); // false
        System.out.println("\"" + test3 + "\" is palindrome? " + sol.isPalindrome(test3)); // true
    }
}
