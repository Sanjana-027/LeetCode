class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] array = new int[m][n];
        
        for (int row[] : indices) {
            for (int i = 0; i < n; i++)
                array[row[0]][i] += 1;
            for (int i = 0; i < m; i++)
                array[i][row[1]] += 1;
        }

        for (int row[] : array) {
            for (int col : row) {
                if (col % 2 != 0)
                count++;
            }
        }
        return count;
    }
}
