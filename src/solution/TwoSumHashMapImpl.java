package solution;

import problem.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap
 * time: O(n)
 * space: O(n)
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
