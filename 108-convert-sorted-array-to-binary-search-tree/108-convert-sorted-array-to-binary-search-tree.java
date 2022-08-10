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
    public TreeNode sortedArrayToBST(int[] nums) {
      if(nums.length == 0) return null;
      
      return helper(nums, 0, nums.length - 1);
    }
  public TreeNode helper(int[] nums, int low, int high) {
    if(low > high) // tree is completed
      return null;
    
    int mid = low + (high - low) / 2; // avoids integer overflow
    TreeNode node = new TreeNode(nums[mid]);
    
    node.left = helper(nums, low, mid - 1);
    node.right = helper(nums, mid + 1, high);
    
    return node;
  }
    }
