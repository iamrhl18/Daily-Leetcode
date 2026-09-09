class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        double average = (double)sum/k;
        int l =1;
        int r = k;
        
        for(int i=k;i<nums.length;i++){
            sum = sum + nums[i] - nums[i-k];
            double avg = (double)sum/k;
            if(avg > average) average = avg;
        }
        return average;

    }
}