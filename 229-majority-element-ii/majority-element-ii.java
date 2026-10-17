class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> list = new HashSet<>();
        for(int num:nums){
            int newfreq = map.getOrDefault(num,0)+1;
            map.put(num,newfreq);
            if(newfreq>nums.length/3) list.add(num);
        }
        return new ArrayList<>(list);
    }
}