class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
		sumRecursion(nums, target, 0, 0);
		return count;
	}

	public void sumRecursion(int[] nums, int target, int index, int sum) {
		if (index == nums.length) {
			if (sum == target) {
				count++;
			}
		}
        else {
            sumRecursion(nums, target, index + 1, sum + nums[index]);
            sumRecursion(nums, target, index + 1, sum - nums[index]);
        }
        
	}
   
    
    
}
