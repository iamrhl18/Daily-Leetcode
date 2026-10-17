class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // This map is used to store the element and their count

        // let's count them

        int threshold = nums.length/2;

        for(int num:nums){
            int newfreq = map.getOrDefault(num,0)+1;
            map.put(num,newfreq);
            if(newfreq>threshold) return num;
        }
        return -1;
    }
}