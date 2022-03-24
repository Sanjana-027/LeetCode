class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int sum : aliceSizes)
            sumA += sum;
        for (int sum : bobSizes)
            sumB += sum;
        
        int diff = (sumA - sumB) / 2;
        for (int valueA : aliceSizes) {
            for (int valueB : bobSizes) {
                if (valueA - valueB == diff)
                    return new int[] {valueA, valueB};
            }
        }
        return null;
    }
}
