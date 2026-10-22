class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                // to do 
                int index = map.get(nums[i]);
                int diff = index -i;

                if(Math.abs(diff)<=k) return true;
            }
            
                map.put(nums[i],i);
            
        }
        return false;
    }
}