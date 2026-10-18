class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result  = new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            int target = -1 * nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[left] + nums[right];
                if(sum==target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(nums[i]);
                    Collections.sort(list);
                    result.add(list);
                    left++;
                    right--;
                }
                else if(sum>target) right--;
                else left++;
            }
        }
        return new ArrayList<>(result);
    }
}