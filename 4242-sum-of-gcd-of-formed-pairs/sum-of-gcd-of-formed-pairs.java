class Solution {

    public int findgcd(int a, int b){
        if(b==0) return a;
        return findgcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int n = nums[0];
        int max = nums[0];
        prefixGcd[0]=findgcd(n,max);
        for(int i=1;i<nums.length;i++){
            n = nums[i];
            max = Math.max(n,max);
            prefixGcd[i]=findgcd(n,max);
        }
        Arrays.sort(prefixGcd);
        int i=0;
        int j=prefixGcd.length-1;
        long sum=0;
        while(i<j){
            sum += findgcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
}