package test;

import problem.TwoSum;
import solution.TwoSumImpl;
import utils.ResultUtils;

public class TwoSumTest {

    private static TwoSum twoSumImpl = new TwoSumImpl();

    public static void main(String[] args) {
        test(new int[]{2, 7, 11, 15}, 9, new int[] {0, 1});
        test(new int[]{3, 2, 4}, 6, new int[] {1, 2});
    }

    private static void test(int[] nums, int target, int[] expect) {
        int[] result = twoSumImpl.twoSum(nums, target);
        ResultUtils.printResult(result, expect);
    }


}
