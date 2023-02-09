class Solution {
    public List<Integer> findDuplicates(int[] nums) {
//         int i = 0;
// 		while (i < nums.length) {
// 			int correctIndex = nums[i] - 1;
// 			if (nums[i] != nums[correctIndex]) {
// 				int temp = nums[correctIndex];
// 				nums[correctIndex] = nums[i];
// 				nums[i] = temp;
// 			} else {
// 				i++;
// 			}
// 		}
        
// 		ArrayList<Integer> res = new ArrayList<>();
// 		for (int index = 0; index < nums.length; index++) {
// 			if (nums[index] != index + 1) {
// 				res.add(nums[index]);
// 			}
// 		}
        
//         return res;
        
        
       // List<Integer> res = new ArrayList<Integer>();
       //  for (int i = 0; i < nums.length; i++) {
       //      int index = Math.abs(nums[i]) - 1;
       //      if (nums[index] < 0)
       //          res.add(Math.abs(nums[i]));
       //      nums[index] = -nums[index];
       //  }
       //  return res;
        
        int[] freq = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]] += 1;
        }
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            if (freq[i] > 1) {
                res.add(i);
            }
        }
        return res;
    }
}
