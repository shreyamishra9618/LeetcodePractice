/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       return helperTree(inorder, 0, inorder.length -1, postorder, 0, postorder.length -1);
    }

    public TreeNode helperTree(int[] inorder, int inStart, int intEnd, int[] postorder, int posStart, int posEnd){

        if(inStart >  intEnd || posStart > posEnd) return null;

        TreeNode root = new TreeNode(postorder[posEnd]);
        int rootIndex = 0;
        for(int i =0; i < inorder.length; i++){
            if(inorder[i] == root.val){
                rootIndex = i;
                break;
            }
        }
        root.left = helperTree(inorder, inStart, rootIndex -1, postorder, posStart, posStart + rootIndex - inStart -1);
        root.right = helperTree(inorder, rootIndex + 1, intEnd, postorder, posStart + rootIndex - inStart, posEnd -1);
        return root;
    }
}