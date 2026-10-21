class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set  = new TreeSet<>();
        for(int num:nums) set.add(num);
        int count =0;
        int prev = -1;
        int maxcount =0;

        for(int num:set){
            if(count ==0 || num == prev+1) count++;
            else{
                maxcount = Math.max(count ,maxcount);
                count =1;
            }
            prev = num;
        }
        maxcount = Math.max(count , maxcount);
        return maxcount;

    }
}