class Solution {
    public void reverse(int[] nums , int i , int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        // There is three steps based on the observations 
        // 1. find the break point like most common prefix 
        // This can be done 
        int n = nums.length;
        int index = -1;
        for(int i =n-2;i>=0;i--){
            if(nums[i] <nums[i+1]){
                index = i;
                break;
            }
        }

        // cheaking the edge case because there is a case if there is not edge case so index remain -1 so 
        // we have to return the reverse of the array and its done 

        if(index == -1){
            reverse(nums,0,n-1);
            return;
        }

        // Step 2 : Now we have the index that was the break point 
        // We have to find the slightly grater element than the index value and swap it 

        for(int i=n-1;i>=index;i--){
            if(nums[i]>nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        // Step 3: Now we have to arrange them in order the number is minimum as possible that can be done by 
        // 1. by sorting them but they are already sorted but in decending order we need to reverse them 

        reverse(nums,index+1,n-1);
        return;
    }
}