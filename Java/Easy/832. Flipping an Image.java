class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for (int[] row : image) {
            for (int col = 0; col < (row.length + 1) / 2; col++) {
                int temp = row[col] ^ 1;
                row[col] = row[row.length - 1 - col] ^ 1;
                row[row.length - 1 - col] = temp;
            }
        }
        return image;
    }
}
