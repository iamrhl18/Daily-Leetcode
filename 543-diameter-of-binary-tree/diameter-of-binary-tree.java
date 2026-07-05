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
    int max = 0;
    public int height(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public void max(TreeNode root){
        if(root ==null) return;
        int lh = height(root.left);
        int rh = height(root.right);
        max = Math.max(max,lh+rh);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right); 
    }
    public int diameterOfBinaryTree(TreeNode root) {
        max(root);
        return max;
    }
}