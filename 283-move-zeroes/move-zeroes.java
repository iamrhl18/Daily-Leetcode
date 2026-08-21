class Solution {
    public void moveZeroes(int[] nums) {
        int index = -1;
        // find the first zero index 
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                index = i;
                break;
            }
        }
        if(index == -1) return;

        for(int i=index+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }
}