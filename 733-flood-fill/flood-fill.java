class Solution {
    public void helper(int[][] image, int sr, int sc, int color,int present,int[] delrow , int[] delcol){
         int row = image.length;
        int col = image[0].length;
        if(sr<0 || sc<0 || sr>=row || sc>=col || image[sr][sc]!=present || image[sr][sc]==color) return;
        image[sr][sc]=color;
        for(int i=0;i<delrow.length;i++){
            helper(image,sr+delrow[i],sc+delcol[i],color,present,delrow,delcol);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
       helper(image,sr,sc,color,image[sr][sc],delrow,delcol);
       return image;
    }
}