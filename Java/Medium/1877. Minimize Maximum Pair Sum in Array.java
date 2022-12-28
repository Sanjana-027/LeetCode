class Solution {
    public int minPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length / 2; i++) {
            int sum = nums[i] + nums[nums.length - 1 - i];
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
 
