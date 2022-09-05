/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)
            return list;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i < n;i++){
                Node curr = q.poll();
                temp.add(curr.val);
                q.addAll(curr.children);
            }
         list.add(temp);
        }
        return list;
    }
}