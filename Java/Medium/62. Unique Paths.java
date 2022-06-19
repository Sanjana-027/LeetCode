class Solution {
    HashMap<String, Integer> memo = new HashMap<String, Integer>();
    
    public int uniquePaths(int m, int n) {
        String key = m + "," + n;
		String keyR = n + "," + m;
        if(memo.containsKey(keyR))
            key = keyR;
		if(memo.containsKey(key))
			return memo.get(key);

		if (m == 1 || n == 1)
			return 1;

		memo.put(key, uniquePaths(m - 1, n) + uniquePaths(m, n - 1));
		return memo.get(key);
    }
}

// BU USING 2D ARRAY ---> [EFFICIENT SOLUTION]


class Solution {
    public int uniquePaths(int m, int n) {
        return uniquePathsHelper(m, n, new int[m + 1][n + 1]);
    }

    private int uniquePathsHelper(int m, int n, int[][] memo) {
        if (m == 1 || n == 1) 
            return 1;
        
        if (memo[m][n] != 0) 
            return memo[m][n];
        
        memo[m][n] = uniquePathsHelper(m - 1, n, memo) + uniquePathsHelper(m, n - 1, memo);
        return memo[m][n];
        
    }
}
