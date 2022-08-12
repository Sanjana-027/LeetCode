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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<String>();
        paths(root, ans, "");
        return ans;
    }
    
    public void paths(TreeNode root, ArrayList<String> ans, String path) {

        // if (root == null) return;
        
        if (root.left == null && root.right == null) {
            path += root.val;
            ans.add(path);
            return;
        }
        
        path += root.val + "->";
        if (root.left != null) paths(root.left, ans, path);
        if (root.right != null) paths(root.right, ans, path);
        
        // paths(root.left, ans, path);
        // paths(root.right, ans, path);
        
        
    }
}
