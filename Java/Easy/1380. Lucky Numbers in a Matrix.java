class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int row = matrix.length, col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            int min = Integer.MAX_VALUE, minIdx = -1;
            int max = 0;

            for (int j = 0; j < col; j++) {
                min = Math.min(matrix[i][j], min);
                if (matrix[i][j] == min) {
                    minIdx = j;
                }
            }

            for (int k = 0; k < row; k++) {
                max = Math.max(matrix[k][minIdx], max);
            }
            if (min == max) {
                ans.add(min);
            }
            
        }
        return ans;
    }
}
