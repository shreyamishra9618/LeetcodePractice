/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        List<Node> path = find_path(p);
        while(q.parent != null){
            for(Node node : path){
                if(node == q) return q;
            }
            q = q.parent;
        }
        return q;  
    }
    public List<Node> find_path(Node p){
        List<Node> path = new ArrayList<>();
        while(p != null){
            path.add(p);
            p = p.parent;
        }
        return path;
    }
}