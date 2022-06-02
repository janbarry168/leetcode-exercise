package solution;

import problem.TwoSumII;

/**
 * Two Pointer
 * time: O(n) >> 2 ms, faster than 67.58%
 * space: O(1) >> 50.1 MB, less than 38.67%
 */
public class TwoSumIITwoPointerImpl implements TwoSumII {

    @Override
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{};
    }

}
