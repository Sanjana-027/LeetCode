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
    
    public boolean findTarget(TreeNode root, int k) {
        // HashSet<Integer> ans = new HashSet<>();
        return findTarget(root, k, new HashSet<>());
    }
    
    public boolean findTarget(TreeNode root, int k, HashSet<Integer> ans) {
        if (root == null) return false;
         
        if(ans.contains(k - root.val)) return true;
        ans.add(root.val);
        
        return findTarget(root.left, k, ans) || findTarget(root.right, k,  ans);
    }
}

    
