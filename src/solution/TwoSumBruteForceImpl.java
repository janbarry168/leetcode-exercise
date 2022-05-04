package solution;

import problem.TwoSum;

/**
 * Brute Force
 * time: O(n^2)
 * space: O(1)
 */
public class TwoSumBruteForceImpl implements TwoSum {

    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}
