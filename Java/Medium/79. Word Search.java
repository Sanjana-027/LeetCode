class Solution {
    public boolean exist(char[][] board, String word) {
		int row = board.length;
		int col = board[0].length;
		boolean[][] visited = new boolean[row][col];
		for (int r = 0; r < row; r++)
			for (int c = 0; c < col; c++)
				if (board[r][c] == word.charAt(0)) {
					if (backtrack(board, visited, r, c, 0, word))
						return true;
				}
		return false;
	}

	private boolean backtrack(char[][] board, boolean[][] visited, int row, int col, int index, String word) {
		if (word.length() == index)
			return true;
		if (row < 0 || col < 0 || row >= board.length || col >= board[0].length)
			return false;
        
		char ch = word.charAt(index);
		if (!visited[row][col] && ch == board[row][col]) {
			visited[row][col] = true;
			boolean res = backtrack(board, visited, row - 1, col, index + 1, word)
					|| backtrack(board, visited, row + 1, col, index + 1, word)
					|| backtrack(board, visited, row, col - 1, index + 1, word)
					|| backtrack(board, visited, row, col + 1, index + 1, word);
			visited[row][col] = false;
			return res;
		}
		return false;
	}

}
