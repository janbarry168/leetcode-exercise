package test;

import problem.TwoSumIV;
import solution.TwoSumIVImpl;
import tree.TreeUtils;
import utils.ResultUtils;

public class TwoSumIVTest {

    public static void main(String[] args) {
        test(new TwoSumIVImpl());
    }

    private static void test(TwoSumIV twoSumIVImpl) {
        boolean result;
        result = twoSumIVImpl.findTarget(TreeUtils.generateTreeNode(new Object[]{5,3,6,2,4,null,7}), 9);
        ResultUtils.printResult(result, true);

        result = twoSumIVImpl.findTarget(TreeUtils.generateTreeNode(new Object[]{5,3,6,2,4,null,7}), 28);
        ResultUtils.printResult(result, false);
    }

}
