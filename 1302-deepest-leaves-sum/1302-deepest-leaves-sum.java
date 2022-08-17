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
    public int maxH(TreeNode root){
        if(root==null) return 0;
        
        return Math.max(maxH(root.left),maxH(root.right))+1;
    }
    int deepSum = 0;
    public void sum(TreeNode root, int k){
            if(root==null) return;
            if(k==1) {
                deepSum+=root.val;
                return;
            }
        sum(root.left,k-1);
        sum(root.right,k-1);

    }
    public int deepestLeavesSum(TreeNode root) {
        
        int k = maxH(root);
        sum(root,k);
        return deepSum;
    }
}