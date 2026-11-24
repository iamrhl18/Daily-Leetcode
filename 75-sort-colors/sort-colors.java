class Solution {
    public static void swap(int a,int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b]= temp;

    }
    public void sortColors(int[] nums) {
        int trav = nums.length-1;
        int low = 0;
        int high = nums.length-1;
        while(low<=trav){
            if(nums[trav]==0){
                swap(low,trav,nums);
                low++;
                
            }
            else if(nums[trav]==2){
                swap(high,trav,nums);
                high--;
                trav--;
            }
            else{
                trav--;
            }

        }
    }
}