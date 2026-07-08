class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode n , int r,int c){
        node = n;
        row=r;
        col=c;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
         List<List<Integer>> list =new ArrayList<>();
        // step1 cteate a class tuple for the queue;
        // now create queue of tuple
        Queue<Tuple> q = new LinkedList<>();
        // now create the TreeMap to store the ans with vertical values
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> mp = new TreeMap<>();
        // now push the root as 0th row and 0th col
        q.offer(new Tuple(root,0,0));
        //Now traversal level order 
        while(!q.isEmpty()){
            // Take that tuple
            Tuple tuple = q.poll();
            //Now extract all the details from the tuple 
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            // Now its time to cheak in map if x not already exist 
            if(!mp.containsKey(x)){
                mp.put(x,new TreeMap<>());
            }
            // now get that x and cheak if y not exist 
            if(!mp.get(x).containsKey(y)){
                mp.get(x).put(y,new PriorityQueue<>());
            }
            // now the map have both x and y now time to put the value to teh priority queue of that x and y lecvel
            mp.get(x).get(y).offer(node.val);

            // Now continue traversing left and right 
            if(node.left!=null) q.offer(new Tuple(node.left,x-1,y+1));
            if(node.right!=null) q.offer(new Tuple(node.right,x+1,y+1));
        }

        // Now we have all the elements in the map 
        // now take TreeMap<Int,que> from map using for-each loop
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:mp.values()){
            List<Integer> temp = new ArrayList<>();
            for(PriorityQueue<Integer> node:ys.values()){
                while(!node.isEmpty()){
                    temp.add(node.poll());
                }
                
            }
            list.add(temp);

        }
        return list;
    }
}