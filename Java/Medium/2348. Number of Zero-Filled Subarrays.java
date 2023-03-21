class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        int i = 0;
        int j = 0;

        while(j < nums.length) {
            while (j < nums.length && nums[j] == 0) {
                j++;
            }
            
            long n = (j - i);
            long sum = n*(n + 1) / 2;
            count += sum;
            i = j + 1;
            j = i;   
        }

        return count;
    }
}
