/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void find(TreeNode root , int k , Set<TreeNode> vis , List<Integer> list, Map<TreeNode , TreeNode> map ){
        vis.add(root);
        if(k==0) {
            list.add(root.val);
            return;
        }
        if(k<0) return;
        // We have three choice 
        if(map.get(root) != null && !vis.contains(map.get(root))){
            find(map.get(root) , k-1 , vis , list,map);
        }
        if(root.left != null && !vis.contains(root.left)){
            find(root.left , k-1 , vis , list,map);
        }
        if(root.right != null && !vis.contains(root.right)){
            find(root.right , k-1 , vis , list,map);
        }

    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode , TreeNode> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        map.put(root,null);
        // Now it's time to mark the parent of each node root node is done 
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left!=null){
                map.put(node.left,node);
                q.offer(node.left);
            }
            if(node.right!=null){
                map.put(node.right,node);
                q.offer(node.right);
            }
        }

        // Now its time to cheak the all node from the target 
        List<Integer> list = new ArrayList<>();
        Set<TreeNode> vis = new HashSet<>();
        find(target,k,vis,list,map);
        return list;
        
    }
}