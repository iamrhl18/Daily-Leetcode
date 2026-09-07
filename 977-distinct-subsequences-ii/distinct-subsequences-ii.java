class Solution {

    int[] dp;
    String s;

    int solve(int i) {

        // Base case
        if (i < 0) {
            return 1; // empty subsequence
        }

        // Already calculated
        if (dp[i] != -1) {
            return dp[i];
        }

        // Take + don't take
        long ans = 2L * solve(i - 1);

        // Find previous occurrence
        int j = i - 1;

        while (j >= 0 && s.charAt(j) != s.charAt(i)) {
            j--;
        }

        // Remove duplicates
        if (j >= 0) {
            ans -= solve(j - 1);
        }

        ans = (ans + 1_000_000_007) % 1_000_000_007;

        return dp[i] = (int) ans;
    }

    public int distinctSubseqII(String s) {

        this.s = s;

        int n = s.length();

        dp = new int[n];

        Arrays.fill(dp, -1);

        // solve() includes empty subsequence
        return (solve(n - 1) - 1 + 1_000_000_007)
                % 1_000_000_007;
    }
}