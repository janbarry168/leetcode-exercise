package solution;

import problem.TwoSumIV;
import tree.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * time: time: O(n)
 * space: space: O(n)
 */
public class TwoSumIVBfsImpl implements TwoSumIV {

    @Override
    public boolean findTarget(TreeNode root, int k) {
        Set set = new HashSet();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode leaf = queue.poll();
            int targetVal = k - leaf.val;
            if (set.contains(targetVal)) {
                return true;
            } else {
                set.add(leaf.val);
            }
            if (leaf.left != null) {
                queue.add(leaf.left);
            }
            if (leaf.right != null) {
                queue.add(leaf.right);
            }
        }
        return false;
    }

}
