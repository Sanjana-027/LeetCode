class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0, k = nums.length;
        if (nums.length == 0)
            return 0;
        else {
            int check = nums[0];
            
            for (int i = 1; i < k; i++) {
                if(check != nums[i]) {
                    index++;
                    nums[index] = nums[i]; 
                     check = nums[i];
                    
                }
            }
            return index + 1;
        }
    }
}      


// Better Approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int index = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[index++] = nums[i];
                k++;
            }
        }
        
        return k;
    }
}
