class Solution {
    public int longestSubarray(int[] nums) {
        int prev = 0, curr = 0, max = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                flag = true;
                prev = curr;
                curr = 0;
            }
            else {
                curr++;
            }
            max = Math.max(prev + curr, max);
        }
        if (!flag) return nums.length - 1;
        return max;
    }
}
