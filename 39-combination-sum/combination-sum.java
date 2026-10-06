class Solution {
    public void backtrack(int[] nums , int i , int sum , int target,List<List<Integer>> result,List<Integer> list){
        if(sum>target || i>=nums.length) return;
        if(sum==target){
            result.add(new ArrayList<>(list));
            return;
        }
        // we have two choice 
        // 1 not pick and move 
        backtrack(nums , i+1,sum,target,result,list);
        // 2 add and stay
        list.add(nums[i]);
        backtrack(nums , i,sum+nums[i],target,result,list);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(candidates,0,0,target,result,list);
        return result;

    }
}