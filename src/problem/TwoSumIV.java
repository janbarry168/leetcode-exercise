package problem;

import tree.TreeNode;

/**
 * #653
 * Given the root of a Binary Search Tree and a target number k,
 * return true if there exist two elements in the BST such that their sum is equal to the given target.
 * <p/>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 104].
 * -104 <= Node.val <= 104
 * root is guaranteed to be a valid binary search tree.
 * -105 <= k <= 105
 */
public interface TwoSumIV {

    boolean findTarget(TreeNode root, int k);

}
