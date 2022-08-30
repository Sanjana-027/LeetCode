class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[correctIndex];
				nums[correctIndex] = nums[i];
				nums[i] = temp; 
            }
            else i++;
        }
        
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != j + 1) {
                return new int[]{nums[j], j + 1};
            }
               
        }
        
        return new int[]{-1, -1};
    }
}
