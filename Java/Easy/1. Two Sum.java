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

// 2nd Approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hm.containsKey(diff))
                return new int[]{hm.get(diff), i};
            
            hm.put(nums[i], i);
        }
         return new int[]{0, 0};
    }
}

    
// 17 - 2 = 15 -----> 2 -> 0
// 17 - 7 = 10 -----> 7 -> 1
// 17 - 11 = 6 -----> 11 -> 2
// 17 - 15 = 2

// ans - x = y
