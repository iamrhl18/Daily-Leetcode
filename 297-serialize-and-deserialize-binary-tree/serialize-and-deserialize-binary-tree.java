/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        if(root==null) return str.toString();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node != null){
                str.append(node.val).append(",");
                q.offer(node.left);
                q.offer(node.right);
            }
            else str.append("#,");
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        int le = data.length();
        if(le==0) return null;

        String values[] = data.split(",");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.offer(root);
        int i = 1;
        while(!q.isEmpty() ){
            TreeNode temp = q.poll();
            
            if(!values[i].equals("#")){
                TreeNode l = new TreeNode(Integer.parseInt(values[i]));
                temp.left = l;
                q.offer(l);

            }
            i++;
            if(!values[i].equals("#")){
                TreeNode r = new TreeNode(Integer.parseInt(values[i]));
                temp.right = r;
                q.offer(r);

            }
            i++;
        }
        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));