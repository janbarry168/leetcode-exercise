package solution;

import problem.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

/**
 * time: O(n) >> 4 ms, faster than 96.57%
 * space: O(1) >> 42.4 MB, less than 92.02%
 */
public class RomanToIntegerImpl implements RomanToInteger {

    public static Map<Character, Integer> map;
    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }


    @Override
    public int romanToInt(String s) {
        int result = 0;

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i < charArray.length - 1) {
                int add = 0;
                if (charArray[i] == 'I' && charArray[i+1] == 'V') {
                    add = 4;
                }
                if (charArray[i] == 'I' && charArray[i+1] == 'X') {
                    add = 9;
                }
                if (charArray[i] == 'X' && charArray[i+1] == 'L') {
                    add = 40;
                }
                if (charArray[i] == 'X' && charArray[i+1] == 'C') {
                    add = 90;
                }
                if (charArray[i] == 'C' && charArray[i+1] == 'D') {
                    add = 400;
                }
                if (charArray[i] == 'C' && charArray[i+1] == 'M') {
                    add = 900;
                }
                if (add != 0) {
                    result += add;
                    i++; continue;
                }
            }
            result += map.get(charArray[i]);
        }

        return result;
    }

}
