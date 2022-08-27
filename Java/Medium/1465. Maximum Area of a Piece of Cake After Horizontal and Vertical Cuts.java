class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long length = 0, breadth = 0;
        
        int maxRangeH = -1;
        for (int i = 1; i < horizontalCuts.length; i++) {
            maxRangeH = Math.max(maxRangeH, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        length = Math.max(maxRangeH, Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]));
        
        int maxRangeV = -1;
        for (int i = 1; i < verticalCuts.length; i++) {
            maxRangeV = Math.max(maxRangeV, verticalCuts[i] - verticalCuts[i - 1]);
        }
        breadth = Math.max(Math.max(maxRangeV, verticalCuts[0]), w - verticalCuts[verticalCuts.length - 1]);
        
        return (int)(((length) * (breadth)) % 1000000007);  
    }
}

// 2nd Approach

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long length = getmaxDest(horizontalCuts, horizontalCuts.length, h);
        long breadth = getmaxDest(verticalCuts, verticalCuts.length, w);
        return (int)((length * breadth) % 1000000007);  
    }
    
    private long getmaxDest(int[] cuts, int length, int end) {
        Arrays.sort(cuts);
        int maxRangeH = -1;
        for (int i = 1; i < length; i++) {
            maxRangeH = Math.max(maxRangeH, cuts[i] - cuts[i - 1]);
        }
        return Math.max(Math.max(maxRangeH, cuts[0]), end - cuts[length - 1]);  
    }
}
