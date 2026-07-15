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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode head = root;
        TreeNode temp = new TreeNode(val);
        if(head ==null) return temp;
        while(true){
            if(root.val>val){
                if(root.left !=null)root = root.left;
                else break;
            }
            else{
                if(root.right != null) root = root.right;
                else break;
            }
        }
        if(root.val > val){
            root.left = temp;
        }else{
            root.right = temp;
        }
        return head;
    }
}