import java.util.*;

public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Use sets to store unique elements
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) {
                intersection.add(n);
            }
        }

        // Convert set to int[]
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));  // Output: [2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums3, nums4)));  // Output: [9, 4] or [4, 9]
    }
}
