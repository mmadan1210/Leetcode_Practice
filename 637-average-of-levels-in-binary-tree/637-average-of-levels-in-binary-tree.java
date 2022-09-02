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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>(); // to store all nodes at curlevel
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            double sum = 0, count = size; // sum and no. of nodes at cur level
            while(size-- > 0){
                TreeNode cur = q.remove();
                sum += cur.val;
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
            double avg = sum/count; // avg of cur level
            res.add(avg);
        }
        return res;
    }
}