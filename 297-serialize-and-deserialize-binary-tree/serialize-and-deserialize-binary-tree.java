/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Codec {
 //variable  i =0;
 private int i;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        //creating a list
        List <String> res = new ArrayList<>();
        serializeDFS(root,res);
        return String.join(",",res);
    }
    private void serializeDFS(TreeNode root,List <String>res){
        //adding "N" null just adding to the res incase does not have left or right child
        //using recursive DFS preorder method;
        if(root == null){
            res.add("N");
            return;
        }
        else{
            res.add(String.valueOf(root.val));
            serializeDFS(root.left,res);
            serializeDFS(root.right,res);
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        //["1,2,3,N,N"]
        //splitting to form a array
        String [] token = data.split(","); //["1","2","3","N"]
        return deserializeDFS(token);
    }
    private TreeNode deserializeDFS(String [] token){
        String t = token[this.i];
        if(t.equals("N")){
            this.i++;
            return null;
        }
        else{
            //initialize new treenode
            TreeNode node = new TreeNode(Integer.parseInt(t));
            this.i++;
            //calling deserializeDFS method again on left subtree and right subtree
            node.left = deserializeDFS(token);
            node.right = deserializeDFS(token);
            return node;
        }
    }
}




// Your Codec object will be instantiated and called as such:

// Codec ser = new Codec();

// Codec deser = new Codec();

// TreeNode ans = deser.deserialize(ser.serialize(root));