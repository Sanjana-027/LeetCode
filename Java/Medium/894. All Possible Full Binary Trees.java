/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer, List<TreeNode>> cache = new HashMap<>(); // DP 1
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> res = new ArrayList<>();
        if (n % 2 == 0) { // DP 2
            return res;
        }
        if (cache.containsKey(n)) { // DP 3
            return cache.get(n);
        }
        if (n == 1){
            res.add(new TreeNode(0));
            return res;
        }
        for(int i = 1; i < n - 1; i += 2){
            List<TreeNode> left = allPossibleFBT(i); 
            List<TreeNode> right = allPossibleFBT(n - 1 - i);
            for (TreeNode nl: left){
                for (TreeNode nr: right){
                    TreeNode cur = new TreeNode(0);
                    cur.left = nl;
                    cur.right = nr;
                    res.add(cur);
                }
            }
        }
        cache.put(n + 1, res); // DP 4
        return res;
    }
}
