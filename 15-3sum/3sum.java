class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result  = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            int target = -1 * nums[i];
            Set<Integer> avail = new HashSet<>();
            for(int j = i+1;j<nums.length;j++){
                int rem = target - nums[j];
                if(avail.contains(rem)){
                    List<Integer> list = new ArrayList<>();
                    list.add(target * -1);
                    list.add(rem);
                    list.add(nums[j]);
                    Collections.sort(list);
                    result.add(list);
                }
                avail.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}