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
    int max_integer;
    public int maxPathSum(TreeNode root) {
       
        max_integer = Integer.MIN_VALUE;
        maxSum(root);
        return max_integer;
    }

    private int maxSum(TreeNode node){
       if(node == null) return 0;
       int left = Math.max(0, maxSum(node.left));
       int right = Math.max(0, maxSum(node.right));
       max_integer = Math.max(max_integer, left + right + node.val);
       return Math.max(left, right) + node.val;
    }
}