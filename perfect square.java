public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;

        int low = 1, high = num;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long mids = (long) mid * mid;

            if (mids == num) {
                return true;
            } else if (mids > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] testCases = {16, 14, 1, 808201, 2147395600};

        for (int num : testCases) {
            System.out.println("Is " + num + " a perfect square? " + solution.isPerfectSquare(num));
        }
    }
}
