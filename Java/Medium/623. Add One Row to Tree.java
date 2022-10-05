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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }
        addOneRow(root, val, depth, 1);
        return root;
    }
    private void addOneRow(TreeNode root, int val, int depth, int count) {
        if (root == null) return;
        if (count < depth - 1) {
            addOneRow(root.left, val, depth, count + 1);
            addOneRow(root.right, val, depth, count + 1);
        }
        else {
            TreeNode temp = root.left;
            root.left = new TreeNode(val);
            root.left.left = temp;
            
            temp = root.right;
            root.right = new TreeNode(val);
            root.right.right = temp;
        }
        
    }
}
