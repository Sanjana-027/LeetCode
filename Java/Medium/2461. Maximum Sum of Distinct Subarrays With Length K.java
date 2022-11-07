class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int start = 0, end = 0;
        long max = 0, sum = 0;
        HashSet<Integer> res =  new HashSet<>();
        
        while (end < nums.length) {
            if (res.contains(nums[end])) {
                start = end;
                sum = 0;
                res.clear();
            }
            res.add(nums[end]);            
            sum += nums[end];
            
            if ((end - start) + 1 == k) {
                max = Math.max(sum, max);
                res.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
           end++; 
        }
        return max;
    }
}
