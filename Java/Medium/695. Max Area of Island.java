class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) 
                    maxArea = Math.max(maxArea, totalArea(grid, i, j));
            }
        }
        return maxArea;
    }
    
    private int totalArea(int[][] grid, int i, int j) {
        if ((i >= 0 && i < grid.length) && (j >= 0 && j < grid[0].length) && grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + totalArea(grid, i + 1, j) + totalArea(grid, i, j + 1) + totalArea(grid, i - 1, j) + totalArea(grid, i, j - 1);
        }
        return 0;
    }
}
