class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        TreeSet<Integer> ts = new TreeSet<Integer>();
        int count = 1, max = 1;
        for (int ele : nums) {
            ts.add(ele);
        }
        
        int prev  = 0;
        boolean flag = false;
        for (Integer value : ts) {
            if(flag == false) {
                flag = true;
                prev = value;
                continue;
            }
            if (Math.abs(prev - value) == 1) {
                count++;
                max = Math.max(max, count);
            }
            else {
                count = 1;
            }
            prev = value;
        }

        return max;
    }
}

// 1 - 0
// 2
// 3
// 4
// 100
// 200
//  1 2 3 4 100 200
