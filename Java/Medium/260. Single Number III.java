class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : hm.keySet()) {
            if (hm.get(key) == 1) {
                ans[idx++] = key;
            }
        }

        return ans;
    }
}
