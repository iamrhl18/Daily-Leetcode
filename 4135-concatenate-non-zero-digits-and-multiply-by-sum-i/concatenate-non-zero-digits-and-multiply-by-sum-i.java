class Solution {
    public long sumAndMultiply(int n) {
        long result =0;
        long multiplier = 1;
        long sum=0;
        while(n>0){
            int digit = n%10;
            if(digit!=0){
                result = digit*multiplier + result;
                sum += digit;
                multiplier *=10;
            }
            n /=10;
        }
        return sum*result;

    }
}