class Solution {
    public int[] twoSum(int[] nums, int target) {
        int answer[] = new int[2];  
        for (int i = 0; i < nums.length; i++) {
            int storeNum1 = nums[i];
            
            for (int j = i+1; j < nums.length; j++) {
                int check = storeNum1 + nums[j];
                
                if (check == target) {
                    answer[0] = i;  
                    answer[1] = j;  
                    break;
               }
            }
        }
        return answer;
    }
}
