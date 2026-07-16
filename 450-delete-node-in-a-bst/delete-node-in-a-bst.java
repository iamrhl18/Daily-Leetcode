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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val > key){
            root.left = deleteNode(root.left , key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right , key);
        }
        else{
            // that means we found that node 
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            TreeNode temp = root.left;
            while(temp.right != null){
                temp = temp.right;
            }
            temp.right = root.right;
            return root.left;
        }
        return root;
        
    }
}