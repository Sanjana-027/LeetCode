class Solution {
    public int arraySign(int[] nums) {
        int x = 1;

        for (int num : nums) {
            if (num < 0) x *= -1;
            else if (num > 0) x *= 1;
            else x *= 0;
        }
        return x;
    }
}
