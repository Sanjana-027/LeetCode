class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0, max = 0;
        
        for(int i = 0; i < k; i++){
             sum += cardPoints[i];
        }
        max = sum;
        for(int left = k - 1, right = cardPoints.length - 1; left >= 0; left--, right--) {
            sum = sum - cardPoints[left] + cardPoints[right];
            max = Math.max(sum, max);
        }    
        return max;
    }
}
