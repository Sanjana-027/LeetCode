class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0) {
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}

// 2nd Approach

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        for (int x : map.keySet()) {
            if (k > 0 && map.containsKey(x + k) || k == 0 && map.get(x) > 1) count++;
        }
        return count;
    }
}
