class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int count = -1;
        while (++count < target.length) {
            if (index[count] >= count) {
                target[index[count]] = nums[count];
            }
            else {
                for (int i = count; i > index[count]; i--)
                target[i] = target[i - 1];
                target[index[count]] = nums[count];
            }
        }
        return target;
    }
}
