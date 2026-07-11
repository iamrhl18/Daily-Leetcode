class Pair{
    TreeNode node;
    int index;
    int level;
    Pair(TreeNode n , int i , int l){
        node = n;
        index = i;
        level = l;

    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int maxwidth = 0;
        if(root==null) return maxwidth;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,1,0));
        TreeMap<Integer,int[]> map = new TreeMap<>();
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            int i = p.index;
            int l = p.level;
            if(!map.containsKey(l)){
                map.put(l,new int[]{i,i});
            }
            else{
                map.get(l)[1]=i;
            }

            if(node.left!=null) q.offer(new Pair(node.left,i*2,l+1));
            if(node.right!=null) q.offer(new Pair(node.right,(i*2)+1,l+1));
        }
        for(int[] arr : map.values()){
            int width = arr[1] - arr[0] +1;
            maxwidth = Math.max(width, maxwidth);
        }
        return maxwidth;
    }
}