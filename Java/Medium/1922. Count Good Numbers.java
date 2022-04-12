class Solution {
    int mod=(int)1e9+7;
    public int countGoodNumbers(long n) {
       

		long first = n % 2 == 0 ? (n / 2) : (n / 2) + 1;
		long mul1 = power(5, first) % mod;
		long mul2 = power(4, n / 2) % mod;
		long ans = (mul1 * mul2) % mod;
		return (int) ans;
    }
    public long power(long x,long y){// this method computes pow(x,y) in O(logn) using divide & conquer
        long temp;
        if(y==0) return 1;//base case (x power 0 = 1)
        temp=power(x,y/2);//computing power for pow(x,y/2) -> divide & conquer step
        if(y%2==0) return (temp*temp)%mod; //using that result of subproblem (2 power 2 = 2 power 1 * 2 power 1)
        else return (x*temp*temp)%mod;//using that result of subproblem (2 power 3 = 2 power 1 * 2 power 1 * 2)
		// if y is odd, x power y = x power y/2 * x power y/2 * x
		// if y is even, x power y = x power y/2 * x power y/2
    }
}

