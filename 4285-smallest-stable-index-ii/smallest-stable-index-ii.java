class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int minele[] = new int[nums.length];

        minele[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            
            minele[i] = Math.min(minele[i+1],nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            int min = minele[i];
            int diff = max - min;
            if(diff<=k) return i;
        }
        return -1;
    }
}