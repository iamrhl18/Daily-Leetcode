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
    TreeNode ans = null;
    public void find(TreeNode root, TreeNode a, TreeNode b){
        if(root==null) return;
        if(a==root || b==root){
            ans = root;
            return;
        }
        if(a.val<root.val && b.val<root.val){
            ans = root;
            find(root.left , a ,b);
        }else if(a.val>root.val && b.val>root.val){
            ans = root;
            find(root.right,a,b);
        }
        else{
            ans = root;
            return;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        find(root,p,q);
        return ans;
    }
}