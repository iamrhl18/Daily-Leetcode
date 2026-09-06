class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxarea = 0;
      
        while(left<right){
            int w = right - left;
            int area = 0;
            if(height[left]<height[right]){
                int h = height[left];
                 area = w*h;
                left++;
            }
            else{
                int  h = height[right];
                area = w*h;
                right--;
            }
            
            if(area>maxarea){
                maxarea = area;
            }
            
        }
        return maxarea;
    }
}