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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stackp = new Stack<>();
        Stack<TreeNode> stackq = new Stack<>();
        if( p == null && q == null) return true;
        if(p == null || q == null) return false;
        if( p != null) stackp.push(p);
        if( q != null) stackq.push(q);
        while(!stackp.isEmpty() && !stackq.isEmpty()){
            TreeNode newp = stackp.pop();
            TreeNode newq = stackq.pop();
            if(newp.val != newq.val) return false;
            if(newp.right != null) stackp.push(newp.right);
             if(newq.right != null) stackq.push(newq.right);
             if(stackp.size() != stackq.size()) return false;
            if(newp.left != null) stackp.push(newp.left);
             if(newq.left != null) stackq.push(newq.left);
               if(stackp.size() != stackq.size()) return false;
        }
       return stackp.size() == stackq.size(); 
    }
}