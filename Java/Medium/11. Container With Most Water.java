class Solution {
    public int maxArea(int[] height) {
       int start = 0, end = height.length - 1;
        int maxCapacity = 0;
        
        while(start < end){
            int w = end - start;
            int h = Math.min(height[start], height[end]);
            int area = w * h;
            
            maxCapacity = Math.max(area, maxCapacity);
            
            if(height[start] < height[end]) start++;
            else end--;
            
        }
        
        return maxCapacity;
    }
}
