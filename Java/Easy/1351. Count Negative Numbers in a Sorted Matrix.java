class Solution {
    public int countNegatives(int[][] grid) {
         int count = 0;
        for (int[] gridRow : grid) {
            count += countNegatives(gridRow);
        }
        return count;
    }
    
    private int countNegatives(int[] nums) {
        int countN = 0;
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] >= 0) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		countN = nums.length - start;
        return countN;
    }
}
