package test;

import problem.TwoSum;
import solution.TwoSumBruteForceImpl;
import solution.TwoSumHashMapImpl;
import utils.ResultUtils;

public class TwoSumTest {

    public static void main(String[] args) {
        test(new TwoSumBruteForceImpl());
        test(new TwoSumHashMapImpl());
    }

    private static void test(TwoSum twoSumImpl) {
        int[] result;
        result = twoSumImpl.twoSum(new int[]{2, 7, 11, 15}, 9);
        ResultUtils.printResult(result, new int[]{0, 1});

        result = twoSumImpl.twoSum(new int[]{3, 2, 4}, 6);
        ResultUtils.printResult(result, new int[]{1, 2});

    }

}
