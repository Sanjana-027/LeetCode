class Solution {
    public int numSquares(int n){
        int[] arr = new int[n + 1];
        return helper(n, arr);
    }
    
    public int helper(int n, int[] arr){
        if (n < 0) return Integer.MAX_VALUE;
        if (n == 0) return 0;
        
        if (arr[n] > 0) return arr[n];
        
        int min = n;
        
        for (int i = 1; i * i <= n; i++) {
            min = Math.min(min, helper(n - (i * i), arr));
        }
        arr[n] = min + 1;
        return min + 1;
    }
}
