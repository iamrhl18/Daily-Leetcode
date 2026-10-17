class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0;i<nums.length;i++){
            if(cnt1 ==0 && ele2 != nums[i]){
                ele1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2==0 && ele1 != nums[i]){
                ele2 = nums[i];
                cnt2 = 1;

            }
            else if(ele1==nums[i]) cnt1++;
            else if(ele2 ==nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;

            }

        }
        cnt1 =0;
        cnt2 = 0;
        for(int num:nums){
            if(ele1 ==num) cnt1++;
            else if(ele2==num) cnt2++;
        }
        List<Integer> list = new ArrayList<>();
        if(cnt1>nums.length/3) list.add(ele1);
        if(cnt2>nums.length/3) list.add(ele2);
        return list;

    }
}