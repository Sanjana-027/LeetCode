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
    public TreeNode sortedArrayToBST(int[] nums) {
        return binarySearch(nums, 0, nums.length - 1);
    }
    
    public TreeNode binarySearch(int[] nums, int low, int high) {
        if(low > high) return null;
        
        int mid = low + (high - low)/2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = binarySearch(nums, low, mid - 1);
        newNode.right = binarySearch(nums, mid + 1, high);
        
        return newNode;

    }
}
