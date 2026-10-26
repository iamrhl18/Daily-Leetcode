class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col =  matrix[0].length-1;
        while(row>=0 && col>=0 && row<matrix.length && col<matrix[0].length){
            int ele = matrix[row][col];
            if(ele == target) return true;
            else if(ele>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}