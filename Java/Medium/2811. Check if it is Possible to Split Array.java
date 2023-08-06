class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {
     
        if (nums.size() <= 2){
            return true;
        }
        for(int i = 0; i < nums.size() - 1 ; i++){
            int sum = nums.get(i) + nums.get(i + 1);
            if (sum >= m){
                return true;
            }
        }
        return false;
    }
}
