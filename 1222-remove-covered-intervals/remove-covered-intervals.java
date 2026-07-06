class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int count=0;
        for(int i=0;i<n;i++){
            int[] curr = intervals[i];
            
            for(int j=0;j<n;j++){
                if(i==j) continue;
                int mov[] =intervals[j];
                if(curr[0]>=mov[0] && curr[1]<=mov[1]){
                    count++;
                    break;
                }
            }
        }
        return n-count;
    }
}