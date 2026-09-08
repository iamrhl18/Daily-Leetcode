class Solution {
    public int countCommas(int n) {
        int comma =0;
        if(n>=1000 && n<=100000){
            comma = n-1000+1;
        }
        return comma;
    }
}