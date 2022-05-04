package test;

import problem.TwoSumII;
import solution.TwoSumIIHashMapImpl;
import solution.TwoSumIITwoPointerImpl;
import utils.ResultUtils;

public class TwoSumIITest {

    public static void main(String[] args) {
        test(new TwoSumIIHashMapImpl());
        test(new TwoSumIITwoPointerImpl());
    }

    private static void test(TwoSumII twoSumIIImpl) {
        int[] result;
        result = twoSumIIImpl.twoSum(new int[]{2, 7, 11, 15}, 9);
        ResultUtils.printResult(result, new int[]{0, 1});

        result = twoSumIIImpl.twoSum(new int[]{3, 2, 4}, 6);
        ResultUtils.printResult(result, new int[]{1, 2});
    }

}
