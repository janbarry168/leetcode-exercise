package solution;

import problem.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap
 * time: O(n) >> 7 ms, faster than 50.45%
 * space: O(n) >> 44.8 MB, less than 60.15%
 */
public class TwoSumHashMapImpl implements TwoSum {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int currIndex = 0; currIndex < nums.length; currIndex++) {
            int matchValue = target - nums[currIndex];
            Integer matchIndex = map.get(matchValue);
            if (matchIndex != null) {
                return new int[]{matchIndex, currIndex};
            } else {
                map.put(nums[currIndex], currIndex);
            }
        }
        return new int[]{};
    }

}
