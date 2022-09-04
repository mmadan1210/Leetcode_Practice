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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, Map<Integer, List<Integer>>> map = new HashMap<>();
        dfs(root, 0, 0, map);
		
        List<Integer> list = new ArrayList<>();
        for(int i : map.keySet()) list.add(i);
        
        Collections.sort(list);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int column : list){
            Map<Integer, List<Integer>> level = map.get(column);
            List<Integer> temp = new ArrayList<>();
            
            for(int lev : level.keySet()) temp.add(lev);
            
            Collections.sort(temp);
            
            List<Integer> t = new ArrayList<>();
            
            for(int l : temp){
                Collections.sort(level.get(l));
                t.addAll(level.get(l));
            }
            
            ans.add(t);
        }
        
        return ans;
    }
    
    public void dfs(TreeNode node, int column, int level, Map<Integer, Map<Integer, List<Integer>>> map){
        if(node == null) return;
        
		map.putIfAbsent(column, new HashMap<Integer, List<Integer>>());
        map.get(column).putIfAbsent(level, new ArrayList<>());
        map.get(column).get(level).add(node.val);
		
        dfs(node.left, column - 1, level + 1, map);
        dfs(node.right, column + 1, level + 1, map);
        
    }
}