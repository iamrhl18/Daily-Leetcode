class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if(x<0) {
            neg = true;
            x = -x;
        }
        int rev = 0;
        while(x>0){
            int digit = x%10;
            x = x/10;

            //Cheaking the rev if goes to overflow or now before doing it 

            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && digit <-8){
                
                    return 0;
                
            }

            if(rev<Integer.MIN_VALUE/10 || rev==Integer.MAX_VALUE&&digit>7){
                
                    return 0;
                
            }

            
            rev= rev*10 + digit;
           
        }
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE) return 0;
        return neg?-rev:rev;
    }
}