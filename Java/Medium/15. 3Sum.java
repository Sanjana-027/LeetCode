class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> res  = new HashSet<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
           int  k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if (sum > 0) k--;
                else if (sum < 0) j++;
            }

        }
        return new ArrayList<>(res);
      
      
      // 2nd Approach
        
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>(); 
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                        lo++; hi--;
                    } 
                    else if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
               }
            }
        }
        return res;
    }
}


// i    lo          hi
// -4  -1  -1  0  1  2
    
// sum = 4
//     x + y =  4
//     -1 + 2 = 4
    
    
   
    
    
