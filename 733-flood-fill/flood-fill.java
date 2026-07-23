class Solution {
    public void helper(int[][] image, int sr, int sc, int color,int present){
         int row = image.length;
        int col = image[0].length;
        if(sr<0 || sc<0 || sr>=row || sc>=col || image[sr][sc]!=present || image[sr][sc]==color) return;
        image[sr][sc]=color;
        helper(image,sr,sc+1,color,present); // right 
        helper(image,sr+1,sc,color,present);  // down 
        helper(image,sr,sc-1,color,present); // left  
        helper(image,sr-1,sc,color,present); // up 
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       helper(image,sr,sc,color,image[sr][sc]);
       return image;
    }
}