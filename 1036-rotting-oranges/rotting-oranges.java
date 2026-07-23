class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh=0;
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    fresh++;
                    
                } 
                else if(grid[i][j]==2){
                    q.offer(new int[] {i,j,0});
                    
                   
                }
            }
        }
        int delrow[] = {-1,0,1,0};
        int delcol[] = {0,1,0,-1};
        if(fresh==0) return 0;
        int time = 0;
        
        while(!q.isEmpty()){
            int curr[] = q.poll();
           
            time = Math.max(time,curr[2]);
            for(int i=0;i<delrow.length;i++){
                int r = curr[0]+delrow[i];
                int c = curr[1]+delcol[i];
                if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1 && grid[r][c] != 0){
                    q.offer(new int[] {r,c,curr[2]+1});
                    
                    grid[r][c]=0;
                    fresh--;
                 
                }
            } 

        }


       if(fresh>0) return -1;
        return time;
       
    }
}