class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] flag = new boolean[m * n];
     
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] == 0) {
                    setZeroes(matrix, flag, m, n, i, j);
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (flag[n * i + j])
                    matrix[i][j] = 0;
            }
        }
    }
    private void setZeroes(int[][] matrix, boolean[] flag, int m, int n, int i, int j) {
        //horizontal
        for (int k = 0; k < n; k++){
            flag [n * i + k] = true;
        }
        //vertical
        for (int k = 0; k < m; k++){
            flag[n * k + j] = true;
        }
    }
}


// 1,2 === 6
// 2,3 === 11
// m = 3, n = 4
//     n * i + j
//     4 * 1 + 2
//     4 * 2 + 3
