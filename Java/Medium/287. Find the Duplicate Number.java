class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
       for(i = 0; i < nums.length - 1; i++){
           if(nums[i] == nums[i + 1]){
               return nums[i];
           }
       }
        
        return nums[i];
    }
}
