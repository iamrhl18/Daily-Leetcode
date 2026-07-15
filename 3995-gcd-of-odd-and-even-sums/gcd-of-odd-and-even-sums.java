class Solution {
    public int gcd(int a , int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a<b){
            return gcd(a,b%a);
        }
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int oddsum = n*(n+1);
        int evensum = n*n;
        return gcd(oddsum,evensum);
    }
}