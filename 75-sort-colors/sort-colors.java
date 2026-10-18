class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int trav = 0;
        while(trav <= end){
            if(nums[trav]==2){
                int temp = nums[trav];
                nums[trav] = nums[end];
                nums[end] = temp;
                end--;
            }else if(nums[trav] ==0){
                int temp = nums[trav];
                nums[trav] = nums[start];
                nums[start] = temp;
                trav++;
                start++;
            }
            else{
                trav++;
            }
        }
    }
}