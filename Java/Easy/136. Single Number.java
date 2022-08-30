class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();    
        
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int key : map.keySet()) {
            if (map.get(key) == 1)
                return key;
        }
        
        return -1;
    }
}
    
// 2nd Approach

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result ^= num;
        }
        return result;
    }
}
