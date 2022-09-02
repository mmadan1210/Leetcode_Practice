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
    public int countGoodNodes(TreeNode root, int max) {
        if(root == null) return 0;
        
        if(root.val >= max) 
            return 1 + countGoodNodes(root.left,root.val) + countGoodNodes(root.right,root.val);
        else
             return countGoodNodes(root.left,max) + countGoodNodes(root.right,max);
        
    }
    
    public int goodNodes(TreeNode root) {
        
        return countGoodNodes(root,root.val);
    }
}