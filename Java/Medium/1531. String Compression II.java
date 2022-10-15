class Solution {
    public int getLengthOfOptimalCompression(String s, int K) {
        int n=s.length();
      int dp[][]=new int[n+1][K+1];
        for(int a[]:dp)
            Arrays.fill(a,n);//n is the maximum size of the string with performing any deletions
        dp[0][0]=0;
        //if n==0 && k==0 we  need to perform 0 operations on an empty string so its is length will still be 0
        for(int i=1;i<=n;i++){
            for(int k=0;k<=K;k++ ){
                if(k>0)//delete
                    dp[i][k]=Math.min(dp[i][k],dp[i-1][k-1]);
                int same=0,dif=0;
                for(int j=i;j>=1;j--){//a b b b b
                        //                      i
                    //same=4
                    //at iter 1,k=0  so  this loop will break when we reach a
                    if(s.charAt(j-1)==s.charAt(i-1))
                        same++;
                    else
                        dif++;
                    if(dif>k)
                        break;
                    dp[i][k]=Math.min(dp[i][k],dp[j-1][k-dif]+getCount(same));
                    //suppose we used 1 diffrent character so we must subtract it from k hence dp[j-1][k-diff]
                    
                }
                
            }
        }
        return dp[n][K];
    }
    int getCount(int same){
        if(same==1)
            return 1;//for charcaters with freq==1 no need to place 1(stated in question)
        if(same<10)
            return 2;//for numbers bet 2-9 the len is 2 for example a2,b3,a9 etc.
        if(same<100)
            return 3;//for numbers <100 len is 3 for example a23,c67 ,x69 etc.
        else
            return 4;//similary for chaacters having freq>100 will have length of 4
    }
}
