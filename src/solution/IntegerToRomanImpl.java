package solution;

import problem.IntegerToRoman;

import java.util.HashMap;
import java.util.Map;

/**
 * time: O(n) >> 5 ms, faster than 94.44%
 * space: O(1) >> 42.1 MB, less than 93.03%
 */
public class IntegerToRomanImpl implements IntegerToRoman {

    private static Map<Integer, String> romanMap;

    static {
        romanMap = new HashMap<>();
        romanMap.put(1, "I");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(40, "XL");
        romanMap.put(50, "L");
        romanMap.put(90, "XC");
        romanMap.put(100, "C");
        romanMap.put(400, "CD");
        romanMap.put(500, "D");
        romanMap.put(900, "CM");
        romanMap.put(1000, "M");
    }

    @Override
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int tens = 1;
        while (num >= 1) {
            int remainder = num % 10;
            if (remainder == 4 || remainder == 9) {
                result.insert(0, romanMap.get(remainder * tens));
            } else {
                String roman = "";
                if (remainder >= 5) {
                    roman = romanMap.get(5 * tens);
                    remainder -= 5;
                }
                repeat(result, romanMap.get(tens), remainder);
                result.insert(0, roman);
            }
            num /= 10;
            tens *= 10;
        }

        return result.toString();
    }

    private void repeat(StringBuilder result, String s, int times) {
        for (int i = times; i > 0; i--) {
            result.insert(0, s);
        }
    }

}
