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
