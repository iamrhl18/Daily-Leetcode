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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        if(preorder.length==1) return root;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        for(int i=1;i<preorder.length;i++){
            TreeNode curr = new TreeNode(preorder[i]);
            if(curr.val < st.peek().val){
                st.peek().left = curr;
                st.push(curr);
            }
            else if(curr.val>st.peek().val){
                TreeNode temp = st.pop();
                while(!st.isEmpty() && st.peek().val<curr.val){
                    temp = st.pop();
                }
                temp.right=curr;
                st.push(curr);
            }
        }
        return root;
    }
}