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
    private int i =0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> res = new ArrayList<>();
        serializeDfs(root, res);
        return String.join(",",res);
    }
    public void serializeDfs(TreeNode root, List<String> res){
        if(root == null){
            res.add("N");
            return;
            
        }
        else{
            res.add(String.valueOf(root.val));
            serializeDfs(root.left, res);
            serializeDfs(root.right, res);

        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] token = data.split(",");
        return deserializeDfs(token); 
    }
    public TreeNode deserializeDfs(String[] token){
        String t = token[this.i];
        if(t.equals("N")){
            i++;
            return null;
        }
        else{
             TreeNode node = new TreeNode(Integer.parseInt(t));
             this.i++;
             node.left = deserializeDfs(token);
             node.right = deserializeDfs(token);
             return node;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));