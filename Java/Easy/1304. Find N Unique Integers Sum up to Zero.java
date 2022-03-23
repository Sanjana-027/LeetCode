class Solution {
    public int[] sumZero(int n) {
         int[] A = new int[n];
        for (int i = 0; i < n; ++i)
            A[i] = i * 2 - n + 1;
        return A;
    }
}

// Approach 2

class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int l = 0, r = result.length - 1;
        while (l < r) {
            result[l] = r;
            result[r] = -r;
            l++; r--;
        }
        return result;
    }
}
