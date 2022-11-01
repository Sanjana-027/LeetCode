class Solution {
    public int[] findBall(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            helper(grid,ans, 0, i, i);
        }
        return ans;
    }
    private void helper(int[][] grid,int[] ans, int row, int col, int idx) {
        if (row == grid.length) {
            ans[idx] = col;
            return;
        }
        if ((grid[row][col] == -1 && (col == 0 || grid[row][col - 1] == 1)) || (grid[row][col] == 1 && (col == grid[0].length - 1 || grid[row][col + 1] == -1))){
            ans[idx] = -1;
            return;
        }
        
        
        if (grid[row][col] == 1)
            helper(grid, ans, row + 1, col + 1, idx);
        else {
            helper(grid, ans, row + 1, col - 1, idx);
        }
        
       
    }
}
// [ 1, 1, 1,-1,-1],
// [ 1, 1, 1,-1,-1],
// [-1,-1,-1, 1, 1],
// [ 1, 1, 1, 1,-1]
// [-1,-1,-1,-1,-1]



// row == row.length ===> return 1

// -1 && col == 0 ===> return -1
// 1 && col == col.length - 1 ===> return -1


// 1 => check right == -1 ====> return -1
// -1 => check left == 1 ====> return -1



// 1 ==> r + 1 c  + 1
// -1 ==> r + 1, c - 1
