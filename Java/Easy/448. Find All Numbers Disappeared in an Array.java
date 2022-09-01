class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[correctIdx];
				nums[correctIdx] = nums[i];
				nums[i] = temp;
            }
            else i++;
        }
        

        ArrayList<Integer> res = new ArrayList<Integer>(); 
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] != idx + 1) {
                res.add(idx + 1);
            }
        }
        return res;
    }
} 
