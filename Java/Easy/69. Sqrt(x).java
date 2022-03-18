class Solution {
    public int mySqrt(int x) {
         if(x<2) {
            return x;
        }
        int i=1;
        while(i<=x/i) {
            i++;
        }
        return i-1;
    }
}
