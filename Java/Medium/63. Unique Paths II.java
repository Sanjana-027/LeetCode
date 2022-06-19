class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
         return uniquePathsHelper(m - 1, n - 1, new int[m][n], obstacleGrid);
    }

    private int uniquePathsHelper(int m, int n, int[][] memo, int[][] obstacleGrid) {
        if (m == -1 || n == -1) 
            return 0;
        
        if(obstacleGrid[m][n] == 1)
            return 0;
        
        if (m == 0 && n == 0)
            return 1;
        
        if (memo[m][n] != 0) 
            return memo[m][n];
        
        memo[m][n] = uniquePathsHelper(m - 1, n, memo, obstacleGrid) + uniquePathsHelper(m, n - 1, memo, obstacleGrid);
        return memo[m][n];
        
      
        
    }
}
