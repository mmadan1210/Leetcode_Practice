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
    static void RSVBT(TreeNode root, List<Integer> list, int lvl){
        if(root==null) return;
        
        if(list.size()==lvl) list.add(root.val);
        
        RSVBT(root.right,list,lvl+1);
        RSVBT(root.left,list,lvl+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        RSVBT(root,list,0);
        return list;
//         if(root==null){
//             return list;
//         }
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         while(q.isEmpty()==false){
//             int size = q.size();
//             for(int i=0;i<size;i++){
//                 TreeNode temp = q.poll();
//                 if(size - 1 == i){
//                     list.add(temp.val);
//                 }
//                 if(temp.left!=null){
//                     q.add(temp.left);
//                 }
//                 if(temp.right!=null){
//                     q.add(temp.right);
//                 }
                
//             }
//         }
        // return list;
    }
}