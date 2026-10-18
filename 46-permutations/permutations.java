class Solution {
    public void findPermutation(List<List<Integer>> result , List<Integer> list ,List<Integer> arr){
        if(arr.size()==0){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.size();i++){
            int ele = arr.get(i);
            list.add(ele);
            arr.remove(i);
            findPermutation(result,list,arr);
            list.remove(list.size()-1);
            arr.add(i,ele);
            
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(int num:nums) arr.add(num);
        findPermutation(result,list,arr);
        return result;
    }
}