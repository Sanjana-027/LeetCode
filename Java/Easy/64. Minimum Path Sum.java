class Solution {
    
    int[][] memo;
    public int minPathSum(int[][] grid) {
        int m = grid.length - 1, n = grid[0].length - 1;
        memo = new int[m + 1][n + 1];
        return dp(grid, m, n);
    }
    
    private int dp(int[][] grid, int m, int n) {
        if (m < 0 || n < 0) return 0;
        if (m == 0 && n == 0) return grid[0][0];
        
        if (memo[m][n] != 0) return memo[m][n];
        
        if(m != 0 && n == 0) return grid[m][n] + dp(grid, m - 1, n);
        if(m == 0 && n != 0) return grid[m][n] + dp(grid, m, n - 1);
        memo[m][n] = grid[m][n] + Math.min(dp(grid, m - 1, n), dp(grid, m, n - 1));
        return memo[m][n];
    }
}
