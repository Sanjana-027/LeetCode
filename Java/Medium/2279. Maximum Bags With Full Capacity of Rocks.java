class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        for (int i = 0; i < capacity.length; i++) {
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);
        int i = 0;
        for (; i < capacity.length; i++) {
            additionalRocks -= capacity[i];
            if (additionalRocks < 0) break;
        }
        return i;
    }
}
// 2 3 4 5
// 1 2 4 4

// 1 1 0 1

// 3 1 0 2

// 3
// 0 1 2 3 4   = 3
