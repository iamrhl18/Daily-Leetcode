class Solution {
    static{
        for (int i=0;i<500;i+=1){
            findMaxConsecutiveOnes(new int [0]);
        }
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length ==0) return 0;
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