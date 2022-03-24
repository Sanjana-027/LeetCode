class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int zeroCount = 0;
        for (int x : arr) {
            if (x != 0) {
                if (binarySearch(x*2, arr)) {
                    return true;
                }
            }
            else {
                zeroCount++;
            }
        }
        return zeroCount >= 2;
    }
    
    public boolean binarySearch(int target, int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return true;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}
