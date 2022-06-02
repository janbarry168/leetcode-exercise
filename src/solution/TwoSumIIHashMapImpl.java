package solution;

import problem.TwoSumII;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap
 * time: O(n) >> 5 ms, faster than 16.32%
 * space: O(n) >> 51.4 MB, less than 5.12%
 */
public class TwoSumIIHashMapImpl implements TwoSumII {

    @Override
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int benchmark = target / 2;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < benchmark) {
                map.put(numbers[i], i);
                continue;
            }
            Integer findIndex = map.get(target - numbers[i]);
            if (findIndex != null) {
                return new int[]{findIndex + 1, i + 1};
            } else {
                map.put(numbers[i], i);
            }
        }
        return new int[]{};
    }

}
