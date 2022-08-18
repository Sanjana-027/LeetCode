class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        Map<Integer, Integer> preSum = new HashMap<Integer, Integer>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                count += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
// DRY _ RUN
// 0 --> 1
// 1 --> 1
// 3 --> 1 
    
// 1 2 3
    
// 1 3 6  ---- 3

//     end - 0 = k
    
//     end - k = 0
    
//    0
//    1
//    2
//    3
//    5
//    3
//    6
//     1 2 3 4 5 6
//     1 3 6 10 15 21
