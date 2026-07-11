
class Solution {
    public TreeNode lca(TreeNode root, TreeNode a,TreeNode b){
        if(root==null||root ==a || root == b ) return root;
        TreeNode l = lca(root.left,a,b);
        TreeNode r = lca(root.right,a,b);
        if(l==null && r==null) return null;
        else if(l!=null && r!=null) return root;
        else if(l!=null) return l;
        else return r;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
        return lca(root,a,b);
        
    }
}