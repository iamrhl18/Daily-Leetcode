class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int cp=1;
        int cp2 =1;
        int mp=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cp==0) cp =1;
            if(cp2 ==0) cp2=1;
            cp *= nums[i];
            cp2 *= nums[n-1-i];
            mp = Math.max(mp,Math.max(cp,cp2));
            
        }
        return mp;
    }
}