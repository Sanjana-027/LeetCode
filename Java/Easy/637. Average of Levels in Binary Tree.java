/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Integer> count = new ArrayList<>();
        List<Double> res = new ArrayList<>();
        
        average(root, 0, res, count);
        
        for (int i = 0; i < res.size(); i++)
            res.set(i, res.get(i) / count.get(i));
        return res;
    }
    
    private void average(TreeNode root, int level, List<Double> sum, List<Integer> count) {
        if (root == null)
            return;
        
        if (level == sum.size()) {
            sum.add((double)root.val);
            count.add(1);
        } else {
            sum.set(level, sum.get(level) + root.val);
            count.set(level, count.get(level) + 1);
        }
        
        average(root.left, level + 1, sum, count);
        average(root.right, level + 1, sum, count);
    }
}
