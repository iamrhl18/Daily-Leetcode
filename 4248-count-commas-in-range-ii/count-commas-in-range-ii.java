class Solution {
    public long countCommas(long n) {
        long ans =0;
        for(long p =1000;p<=n;){
            ans += n-p+1;
            if(p>Long.MAX_VALUE/1000){
                break;
            }
            p *=1000;
        }
        return ans;
    }
}