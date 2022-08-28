class Solution {
    public boolean canJump(int[] nums) {
        int jump = nums[0];
        int i = 1;
        for (; i < nums.length; i++) {
            if (jump == 0) break;
            jump = Math.max(jump - 1, nums[i]);
        }
        return i == nums.length;
    }
}
