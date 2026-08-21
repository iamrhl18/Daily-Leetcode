class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
        int count =0;
        for(int ele:nums){
            if(ele ==1){
                count++;
                maxcount=Math.max(count , maxcount);
            }else{
                count =0;
            }
        }
        return maxcount;
    }
}