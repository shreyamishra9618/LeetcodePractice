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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if( preorder == null || inorder == null || preorder.length != inorder.length){
            return null;
        }
        return helperTree( preorder, inorder, 0 ,0 , inorder.length -1);
    }

private TreeNode helperTree(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd){
    if(preStart > preorder.length -1 || inStart > inEnd) return null;
    int rootVal = preorder[preStart];
    TreeNode root = new TreeNode(rootVal);
    int inIndex = 0;
    for(int i =inStart; i <= inEnd ; i++){
        if( inorder[i]  == root.val){
            inIndex =i;
            break;
        }
    }
    int leftSubtree = inIndex - inStart;
    root.left = helperTree( preorder , inorder, preStart +1, inStart ,inIndex - 1 );
    root.right =helperTree( preorder, inorder, preStart + leftSubtree +1, inIndex + 1 ,inEnd);
    return root;
}
}