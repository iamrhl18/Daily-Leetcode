class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            int sum = -1*nums[i];
            while(left<right){
                int add = nums[left]+nums[right];
                if(add==sum){
                    result.add(new ArrayList(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                    while(left<nums.length-2 && nums[left]==nums[left-1]) left++;
                    while(right>=0 && nums[right]==nums[right+1]) right--;
                }
                else if(add<sum) left++;
                else right--;
            }
           
        }
         return result;
    }
}