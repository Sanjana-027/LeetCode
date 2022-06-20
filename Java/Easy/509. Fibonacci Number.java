# 1st Approach


class Solution {
    public int fib(int n) {
         if(n == 0 || n == 1){
             return n;
         }
         return   + fib(n - 2);
    }
}


# 2nd Approach

class Solution {
    public int fib(int n) {
       int num1 = 0, num2 = 1, sum = 0;  
        while (n-- > 0) {
            sum = num1 + num2;
			num1 = num2;
			num2 = sum;
        }
        return num1;
    }
}

//3rd Approach DP
class Solution {
    public int fib(int n) {
        int[] memo = new int[n + 1]; 
        return dp(n, memo);
    }
    private int dp(int n, int[] memo) {
        if(memo[n] != 0){
            return memo[n];
        }
        if(n == 1 || n == 0) return n;
        
        memo[n] =  dp(n - 1, memo) + dp(n - 2, memo);
        return memo[n];
    }
}
