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
public class Solution {
    private boolean result = true;

public boolean isBalanced(TreeNode root) {
    maxDepth(root);
    return result;
}

public int maxDepth(TreeNode root) {
    if (root == null)
        return 0;
    int leftCount = maxDepth(root.left);
    int rightCount = maxDepth(root.right);
    
    if (Math.abs(leftCount - rightCount) > 1)
        result = false;
    return 1 + Math.max(leftCount, rightCount);
    }
} 
