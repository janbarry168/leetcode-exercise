package solution;

import problem.TwoSumIV;
import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * preorder: middle > left > right
 * inorer: left > middle > right
 * posrorder: left > right > middle
 *
 * time: O(n) >> 3 ms, faster than 92.63%
 * space: O(n) >> 42.2 MB, less than 99.42%
 */
public class TwoSumIVDfsImpl implements TwoSumIV {

    @Override
    public boolean findTarget(TreeNode root, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer[] target = new Integer[1];
        traverseInorder(k, map, root, target);
        return target[0] != null;
    }

    private void traverseInorder(int k, Map map, TreeNode leaf, Integer[] target) {
        if (leaf == null || target[0] != null) {
            return;
        }
        traverseInorder(k, map, leaf.left, target);
        int targetVal = k - leaf.val;
        if (map.get(targetVal) != null) {
            target[0] = targetVal;
        } else {
            map.put(leaf.val, leaf.val);
        }
        traverseInorder(k, map, leaf.right, target);
    }

}
