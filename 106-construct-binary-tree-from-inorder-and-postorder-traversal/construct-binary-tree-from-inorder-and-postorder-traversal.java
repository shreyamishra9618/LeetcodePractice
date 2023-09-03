import java.util.HashMap;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Create a hashmap to store the indices of elements in the inorder array
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return helperTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, inorderMap);
    }

    public TreeNode helperTree(int[] inorder, int inStart, int inEnd, int[] postorder, int posStart, int posEnd, HashMap<Integer, Integer> inorderMap) {
        if (inStart > inEnd || posStart > posEnd) return null;

        // The root node's value is at the end of the postorder array
        TreeNode root = new TreeNode(postorder[posEnd]);
        int rootIndex = inorderMap.get(root.val);

        // Calculate the size of the left subtree
        int leftSubtreeSize = rootIndex - inStart;

        // Recursively construct the left and right subtrees
        root.left = helperTree(inorder, inStart, rootIndex - 1, postorder, posStart, posStart + leftSubtreeSize - 1, inorderMap);
        root.right = helperTree(inorder, rootIndex + 1, inEnd, postorder, posStart + leftSubtreeSize, posEnd - 1, inorderMap);

        return root;
    }
}
