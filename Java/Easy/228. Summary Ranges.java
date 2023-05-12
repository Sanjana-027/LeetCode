class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        int i = 1, j = 0;

        while (i <= nums.length) {
            if (i < nums.length && nums[i] - nums[i - 1] == 1) {
                i++;
            }
            
            else {
                if (i - 1 != j)
                    res.add(nums[j] + "->" + nums[i - 1]);
                else res.add("" + nums[j]);
                j = i;
                i++;
            }
        }
        
        return res;
    }
}

//  j         i
// [0,1,2,4,5,7]

// [0,2] [4,5] []
