package solution;

import problem.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumImpl implements TwoSum {

    @Override
    public int[] twoSum(int[] nums, int target) {
        return solution2(nums, target);
    }

    /**
     * Brute Force
     * time: O(n^2)
     * space: O(1)
     */
    private int[] solution1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    /**
     * HashMap
     * time: O(n)
     * space: O(n)
     */
    private int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int currIndex = 0; currIndex < nums.length; currIndex++) {
            int matchValue = target - nums[currIndex];
            Integer matchIndex = map.get(matchValue);
            if (matchIndex != null) {
                return new int[] {matchIndex, currIndex};
            } else {
                map.put(nums[currIndex], currIndex);
            }
        }
        return new int[] {};
    }

}
