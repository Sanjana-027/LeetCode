class Solution {
     public boolean increasingTriplet(int[] nums) {
      
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= i) { i = n; } 
            else if (n <= j) { j = n; }
            else return true;
        }
        return false;
    }
}
// k <= i
// if (i >= k)
// 4,2,1,11,7,10,1

    
// 2 10 12
