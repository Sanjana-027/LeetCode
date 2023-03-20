class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(k, n, res, new ArrayList<>(), 1);
        return res;
    }
    private void helper (int k, int target, List<List<Integer>> res, ArrayList<Integer> temp, int start) {
        if (temp.size() > k || target < 0) return;

        if (temp.size() == k && target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= 9; i++) {
            temp.add(i);
            helper(k, target - i, res, temp, i + 1);
            temp.remove(temp.size() - 1);             
        }
    }
}
