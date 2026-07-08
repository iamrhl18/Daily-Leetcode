import java.util.*;

class Solution {
    static final long MOD = 1_000_000_007L;

    public int[] sumAndMultiply(String s, int[][] queries) {

        int m = s.length();

        // Store non-zero digits and their positions
        ArrayList<Integer> digitsList = new ArrayList<>();
        ArrayList<Integer> posList = new ArrayList<>();

        // first[i] = first non-zero digit index in compressed array at or after i
        int[] first = new int[m + 1];
        Arrays.fill(first, -1);

        int next = -1;
        for (int i = m - 1; i >= 0; i--) {
            if (s.charAt(i) != '0')
                next = i;
            first[i] = next;
        }

        // last[i] = last non-zero digit index in compressed array at or before i
        int[] last = new int[m];
        int prev = -1;
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) != '0')
                prev = i;
            last[i] = prev;
        }

        // Map original position -> compressed index
        int[] map = new int[m];
        Arrays.fill(map, -1);

        for (int i = 0; i < m; i++) {
            if (s.charAt(i) != '0') {
                map[i] = digitsList.size();
                digitsList.add(s.charAt(i) - '0');
                posList.add(i);
            }
        }

        int n = digitsList.size();

        int[] digit = new int[n];
        for (int i = 0; i < n; i++)
            digit[i] = digitsList.get(i);

        // powers of 10
        long[] pow10 = new long[n + 1];
        pow10[0] = 1;
        for (int i = 1; i <= n; i++)
            pow10[i] = pow10[i - 1] * 10 % MOD;

        // prefix concatenation
        long[] pref = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = (pref[i] * 10 + digit[i]) % MOD;
        }

        // prefix digit sum
        long[] sum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + digit[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            if (first[l] == -1 || last[r] == -1 || first[l] > r) {
                ans[i] = 0;
                continue;
            }

            int L = map[first[l]];
            int R = map[last[r]];

            if (L > R) {
                ans[i] = 0;
                continue;
            }

            int len = R - L + 1;

            long x = (pref[R + 1] - pref[L] * pow10[len]) % MOD;
            if (x < 0)
                x += MOD;

            long digitSum = sum[R + 1] - sum[L];

            ans[i] = (int) (x * (digitSum % MOD) % MOD);
        }

        return ans;
    }
}