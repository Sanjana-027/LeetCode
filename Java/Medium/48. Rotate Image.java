class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1 - j; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }   
    }
}
// DRY - RUN
// 0,0  0,1  0,2
// 1,0  1,1  1,2
// 2,0  2,1  2,2
   
    
// 1 4 7   // 0,0  0,2
// 2 5 8   // 1,0  1,2
// 3 6 9

// 4 - 1         4 - 1 - j
// 0,0  0,3      0,1  0,2      0,2  0,1
