class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int minval[]=new int[nums.length];
        minval[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            minval[i] = Math.min(nums[i],minval[i+1]);
        }
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            int min = minval[i];
            int res=max-min;
            if(res<=k) return i;

        }
        return -1;
    }
}