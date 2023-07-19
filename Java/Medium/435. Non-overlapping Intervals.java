class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int i = 0, j = 1, count = 0;
        while (j < intervals.length) {
            if (intervals[i][1] > intervals[j][0]) {
                j++;
                count++;
            }
            else {
                i = j;
                j++;
            }
        }
        return count;
    }
}
