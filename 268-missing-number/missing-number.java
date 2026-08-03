class Solution {
    public int missingNumber(int[] nums) {
        int r = 0;
        for(int i=0;i<nums.length;i++){
            r = r^i^nums[i];
        }
        r = r^nums.length;
        return r;
    }
}