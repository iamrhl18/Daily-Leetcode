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

class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode n , int l){
        node = n;
        level = l;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;

        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();

        q.offer(new Pair(root,0));

        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            int l = p.level;


                map.put(l,node.val);
            

            if(node.left!=null) q.offer(new Pair(node.left,l+1));
            if(node.right!=null) q.offer(new Pair(node.right,l+1));
        }

        for(int ele:map.values()){
            list.add(ele);
        }

        return list;


    }
}