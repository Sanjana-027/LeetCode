class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int resCounter = nums.length;
        for (int i = 0; i < nums.length; i++) {
          if (nums[i] >= resCounter) {
            if (( i == 0 || nums[i - 1] < resCounter))
              return resCounter;
          } else {
            resCounter--;
          }
        }
        return -1;
    }
}
