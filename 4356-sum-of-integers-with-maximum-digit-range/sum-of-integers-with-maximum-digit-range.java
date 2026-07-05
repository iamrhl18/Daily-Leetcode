class Solution {
    public int[] minmax(int num){
        if(num==0) return new int[] {0,0};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(num>0){
            int digit = num%10;
            min= Math.min(min,digit);
            max= Math.max(max,digit);
            num = num/10;
        }
        return new int[] {min,max};
    }
    public int maxDigitRange(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int[] curr=minmax(nums[i]);
            arr[i] = curr[1]-curr[0];
        }
        int max = arr[0];
        for(int ele:arr){
            max = Math.max(max,ele);
        }
        int sum =0;
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            if(ele==max) {
                sum += nums[i];
            }
        }
        return sum;
    }
}