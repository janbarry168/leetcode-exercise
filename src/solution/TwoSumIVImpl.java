package solution;

import problem.TwoSumIV;
import tree.TreeNode;

/**
 * time: O(n+Log(n)) >> 2 ms, faster than 98.74%
 * space: O(1) >> 50 MB, less than 62.44%
 */
public class TwoSumIVImpl implements TwoSumIV {

    @Override
    public boolean findTarget(TreeNode root, int k) {
        TreeNode leaf = popLeaf(root);
        while (leaf != null && leaf != root) {
            TreeNode targetLeaf = search(root, k - leaf.val);
            if (targetLeaf != null) {
                return true;
            }
            leaf = popLeaf(root);
        }
        return false;
    }

    public TreeNode popLeaf(TreeNode current) {
        if (current.left != null) {
            TreeNode leaf = popLeaf(current.left);
            if (current.left == leaf) current.left = null;
            return leaf;
        } else if (current.right != null) {
            TreeNode leaf = popLeaf(current.right);
            if (current.right == leaf) current.right = null;
            return leaf;
        } else {
            return current;
        }
    }

    public TreeNode search(TreeNode current, int targetVal) {
        if (current.val == targetVal) {
            return current;
        } else if (current.val > targetVal && current.left != null) {
            return search(current.left, targetVal);
        } else if (current.val < targetVal && current.right != null) {
            return search(current.right, targetVal);
        } else {
            return null;
        }
    }

}
