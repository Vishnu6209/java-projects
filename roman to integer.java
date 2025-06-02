import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Process from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            // If current value is at least prev value, add it; otherwise subtract
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));    // 3
        System.out.println(romanToInt("IV"));     // 4
        System.out.println(romanToInt("IX"));     // 9
        System.out.println(romanToInt("LVIII"));  // 58
        System.out.println(romanToInt("MCMXCIV"));// 1994
    }
}
