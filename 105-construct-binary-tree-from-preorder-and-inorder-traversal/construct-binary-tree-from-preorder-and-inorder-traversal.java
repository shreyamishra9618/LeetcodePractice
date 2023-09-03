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

      return helperTree(0,0, inorder.length, preorder, inorder);  
    }

    public TreeNode helperTree( int preStart, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(preStart > preorder.length -1 || inStart > inEnd ) return null;
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        int inIndex =0;
        for(int i = inStart; i <= inEnd; i++){
            if(  root.val == inorder[i] ){
                 inIndex = i;
                 break;
            }
          }
          root.left =  helperTree(preStart + 1,inStart, inIndex - 1, preorder, inorder);  
          root.right =  helperTree(preStart + inIndex - inStart +1, inIndex + 1, inEnd, preorder, inorder);  
          return root;
        }


    }
