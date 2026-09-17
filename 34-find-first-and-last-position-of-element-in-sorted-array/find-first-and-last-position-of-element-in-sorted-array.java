class Solution {
    public int firstpos(int nums[] , int target){
        int left = 0;
        int right = nums.length -1;
        int index = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                index = mid;
                right = mid -1;
            }
            else if(nums[mid] > target){
                right = mid -1;
            }
            else left = mid + 1;
        }
        return index;
    }
    public int lastpos(int nums[] , int target){
        int left = 0;
        int right = nums.length -1;
        int index = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                index = mid;
                left = mid +1;
            }
            else if(nums[mid] > target){
                right = mid -1;
            }
            else left = mid + 1;
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstpos(nums,target);
        int last = lastpos(nums,target);
        return new int[] {first,last};
    }
}