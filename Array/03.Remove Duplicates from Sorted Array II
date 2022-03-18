// Medium Array



class Solution {
    public int removeDuplicates(int[] nums) {
     int index = 0, k = nums.length;
        int count = 1;
        int pre = nums[0];
      
        
        for (int i = 1; i < k; i++) {
            if (count >= 2 && pre == nums[i]) {
                continue;
            }
            else if(count < 2 && pre == nums[i]) {
                count++;
                index++;
                nums[index] = nums[i];
                
            }
            else {
                count = 1;
                index++;
                nums[index] = nums[i];
                pre = nums[i];
            }
        }
        return index + 1;
    }
}
