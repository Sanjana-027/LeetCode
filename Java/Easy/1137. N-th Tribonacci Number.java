class Solution {
    public int tribonacci(int n) {
        int[] memo = new int[n + 1];
        return dp(n,memo);
    }
    private int dp(int n, int[] memo) {
        if(memo[n] != 0) return memo[n];
        if (n == 0) return 0;
        
        if (n == 1 || n == 2) return 1;
        
        memo[n] =  dp(n - 3, memo) + dp(n - 2, memo) + dp(n - 1, memo);
        
        return memo[n];
    }
}
