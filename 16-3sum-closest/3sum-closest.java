class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int maxsum = 0;
        int maxdiff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[left]+nums[right]+nums[i];
                int diff = Math.abs(sum-target);
                if(diff<maxdiff) {
                    maxsum = sum;
                    maxdiff = diff;
                }
                if(sum==target){
                    maxsum = sum;
                    left++;
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }   
        return maxsum;
    }
}