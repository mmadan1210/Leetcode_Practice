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
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        boolean left = isValidBST(root.left);
        if(left==false) return false;
        if(root.val<=pre) return false;
        pre=root.val;
        boolean rightValid = isValidBST(root.right);
        if (!rightValid) return false;
        return true;
    }
}