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
    public int findindex(int ele , int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele) return i;
        }
        return 0; // never going to execute it is dummy vallue 
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int l = inorder.length;
        if(l==0) return null;
        if(l==1) return new TreeNode(postorder[l-1]);
         int index = findindex(postorder[l-1],inorder);
        return new TreeNode(postorder[l-1], buildTree(Arrays.copyOfRange(inorder,0,index) , Arrays.copyOfRange(postorder,0,index)),buildTree(Arrays.copyOfRange(inorder,index+1,l) , Arrays.copyOfRange(postorder,index,l-1)));

    }
}