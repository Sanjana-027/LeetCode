class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0, index = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
                k++;
            }  
        }
        
        return k;
    }
}

