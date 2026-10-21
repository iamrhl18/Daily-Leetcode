class Solution {
    public int calsum(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            int sqr = digit * digit;
            sum += sqr;
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(true){
            int val = calsum(n);
            if(val ==1) return true;
            if(seen.contains(val)) return false;
            seen.add(val);
            n = val;
        }
       

    }
}