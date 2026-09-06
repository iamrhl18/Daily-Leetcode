class Solution {
    
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        Long[][] dp = new Long[n][m];
        
        return (int) solve(0, 0, s, t, dp);
    }
    
    public long solve(int i, int j, String s, String t, Long[][] dp) {
        
        // Successfully formed t
        if (j == t.length()) {
            return 1;
        }
        
        // s finished but t is not
        if (i == s.length()) {
            return 0;
        }
        
        // Already calculated
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        
        // Don't take s[i]
        long notTake = solve(i + 1, j, s, t, dp);
        
        // Take s[i] if characters match
        long take = 0;
        
        if (s.charAt(i) == t.charAt(j)) {
            take = solve(i + 1, j + 1, s, t, dp);
        }
        
        return dp[i][j] = take + notTake;
    }
}