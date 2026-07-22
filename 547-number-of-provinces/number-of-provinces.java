class Solution {

    public void dfs(int node ,int[][] isConnected,int[] vis){
        
        for(int i =0;i<isConnected.length;i++){
            vis[node]=1;
            if(isConnected[node][i]==1 && vis[i]==0){
                dfs(i,isConnected,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int vis[] = new int[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==0) {
                count++;
                dfs(i,isConnected,vis);
            }
        }
        return count;
    }
}