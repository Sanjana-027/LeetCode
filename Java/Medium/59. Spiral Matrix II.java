class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int count = 1;

        while(true) {
            if (left > right) break;
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count++;
            }
            top++;

            if (top > bottom) break;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count++;
            }
            right--;

            if (left > right) break;
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = count++;
            }
            bottom--;

            if (top > bottom) break;
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = count++;
            }
            left++;
        }
        return matrix;
    }
}
