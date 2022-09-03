public class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new LinkedList<>();
        
        int n = matrix.length, m = matrix[0].length;
        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];
        
        // horizontally
        for (int i = 0; i < n; i++) {
            dfs(matrix, n, m, pacific, Integer.MIN_VALUE, i, 0);
            dfs(matrix, n, m, atlantic, Integer.MIN_VALUE, i, m - 1);
        }
        
        //vertically
        for (int i = 0; i < m; i++) {
            dfs(matrix, n, m, pacific, Integer.MIN_VALUE, 0, i);
            dfs(matrix, n, m, atlantic, Integer.MIN_VALUE, n - 1, i);
        }
        
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                if (pacific[i][j] && atlantic[i][j]) 
                    res.add(Arrays.asList(i, j));
        return res;
    }
    
    public void dfs(int[][] matrix, int n, int m, boolean[][] visited, int height, int x, int y){
        
        if (x < 0 || x >= n || y < 0 || y >= m || visited[x][y] || matrix[x][y] < height)
            return;
        
        visited[x][y] = true;
        
        dfs(matrix, n, m, visited, matrix[x][y], x + 1, y);
        dfs(matrix, n, m, visited, matrix[x][y], x - 1, y);
        dfs(matrix, n, m, visited, matrix[x][y], x, y + 1);
        dfs(matrix, n, m, visited, matrix[x][y], x, y - 1);
    }
}
