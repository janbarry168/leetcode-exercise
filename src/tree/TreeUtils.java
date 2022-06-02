package tree;

public class TreeUtils {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.generateTreeNode(new Object[]{5,3,6,2,4,null,7});
        System.out.println(root);
    }

    public static TreeNode generateTreeNode(Object[] valueArray) {
        TreeNode root = new TreeNode((int) valueArray[0]);
        for (int i = 1; i < valueArray.length;i++) {
            if (valueArray[i] != null) {
                TreeNode leaf = new TreeNode();
                leaf.val = (int) valueArray[i];
                append(root, i, leaf);
            }
        }
        return root;
    }

    public static TreeNode append(TreeNode root, int index, TreeNode node) {
        String binaryString = Integer.toBinaryString(index + 1);
        TreeNode current = getIndexParent(root, binaryString);
        insert(current, binaryString.charAt(binaryString.length() - 1), node);
        return current;
    }

    public static TreeNode getIndexParent(TreeNode root, String binaryString) {
        TreeNode current = root;
        int charIndex = 1;
        while (charIndex < binaryString.length() - 1) {
            current = getLeaf(binaryString.charAt(charIndex++), current);
        }
        return current;
    }

    public static void insert(TreeNode current, char binaryString, TreeNode leaf) {
        if ('0' == binaryString) {
            current.left = leaf;
        } else if ('1' == binaryString) {
            current.right = leaf;
        }
    }

    public static TreeNode getLeaf(char binaryString, TreeNode leaf) {
        if ('0' == binaryString) {
            return leaf.left;
        } else if ('1' == binaryString) {
            return leaf.right;
        } else {
            return null;
        }
    }

}
