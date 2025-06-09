package projectofjava;
import java.util.*;
public class solutions {
	 public int[] plusOne(int[] digits) {
	        for (int i = digits.length - 1; i >= 0; i--) {
	            if (digits[i] < 9) {
	                digits[i]++;
	                return digits;
	            }
	            digits[i] = 0;
	        }
	        // All digits were 9, so we need an extra digit
	        digits = new int[digits.length + 1];
	        digits[0] = 1;
	        return digits;
	    }

	    public static void main(String[] args) {
	        solutions solution = new solutions();

	        // Test case 1
	        int[] digits1 = {1, 2, 9};
	        int[] result1 = solution.plusOne(digits1);
	        System.out.println("Output 1: " + Arrays.toString(result1)); // [1, 2, 4]

	        // Test case 2
	        int[] digits2 = {9, 9, 9};
	        int[] result2 = solution.plusOne(digits2);
	        System.out.println("Output 2: " + Arrays.toString(result2)); // [1, 0, 0, 0]

	        // Test case 3
	        int[] digits3 = {0};
	        int[] result3 = solution.plusOne(digits3);
	        System.out.println("Output 3: " + Arrays.toString(result3)); // [1]
	    }
}
