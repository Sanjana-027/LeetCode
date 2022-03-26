class Solution {
   public int missingNumber(int[] nums) {
        // Sort Array using Cycle Sort
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums.length && nums[i] != i) {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
            else {
                i++;
            }
        }
        
        // Finding the missing number
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }
        return nums.length;
    }
}
