class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
    	int[] res = new int[n];
        
    	int right = 1, left = 1;
    	for (int i = 0; i < n; i++) {
    		res[i] = left;
    		left *= nums[i];
    	}
    	for(int i = n - 1; i >= 0; i--) {
    		res[i] *= right;
    		right *= nums[i];
    	}
    	return res;
    }
}

// Dry - Run
// num 1 2 3 4
// res 1 1 2 6  ---- left
//    24 12 4 1 ---- right
