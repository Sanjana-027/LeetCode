class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int no : nums){
            sum += no;
            if(min > no)
                min = no;
        }
        return sum - (min * n);
    }
}

