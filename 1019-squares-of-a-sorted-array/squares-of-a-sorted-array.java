class Solution {
    public int[] sortedSquares(int[] nums) {
        int neg = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) neg = i;
        }
        int pos = neg+1;
        int[] res = new int[nums.length];
        int pt = 0;
        while(neg>=0 && pos<nums.length){
            int a=(int)Math.pow(nums[neg],2);
            int b=(int)Math.pow(nums[pos],2);

            if(a<b){
                res[pt++]=a;
                neg--;
            }else{
                res[pt++] = b;
                pos++;
            }
        }
        while(neg>=0){
            res[pt++]=(int)Math.pow(nums[neg],2);
            neg--;
        }
        while(pos<nums.length){
            res[pt++] =(int) Math.pow(nums[pos],2);
            pos++;
        }
        return res;
    }
}