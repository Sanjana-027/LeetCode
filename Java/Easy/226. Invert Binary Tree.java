class Solution {
    public TreeNode invertTree(TreeNode root) {

         if(null == root){
            return null;
        }
        
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        
        return root;
      
    }
  }
