class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
        for(int ind = 1; ind < nums.length; ind++) {
            if(nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;  
    }
}


