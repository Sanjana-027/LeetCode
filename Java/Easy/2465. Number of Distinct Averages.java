class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> set = new HashSet<>();
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            double avg = ((double)nums[start++] + nums[end--]) / 2;
            set.add(avg);            
        }
        
        return set.size();
    }
}
