class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        if (d > jobDifficulty.length) {
            return -1;
        }
        int dp[][] = new int[d][jobDifficulty.length];
        int diff = 0;
        for(int i = 0; i < jobDifficulty.length; i++){
            diff = Math.max(diff, jobDifficulty[i]);
            dp[0][i] = diff;
        }
        
        for(int i = 1; i < d; i++){
            for(int j = 1; j < jobDifficulty.length; j++){
                diff = 0;
                dp[i][j] = Integer.MAX_VALUE;
                   for (int k = j; k >= i; k--) {
                    diff = Math.max(diff, jobDifficulty[k]);
                    dp[i][j] = Math.min(dp[i][j], diff + dp[i-1][k-1]);
                }
            }
        }
        return dp[d -1] [jobDifficulty.length - 1];
    }
}
