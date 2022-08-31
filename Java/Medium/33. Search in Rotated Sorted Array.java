class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int maxValue = findMaxValue(nums, start, end);
        
        if (maxValue == -1) {
            return binarySearch(nums, start, end, target);
        }
        if (nums[maxValue] == target) {
            return maxValue;
        }        
        int ans = binarySearch(nums, start, maxValue - 1, target);
        
        if (ans == -1) {
            return binarySearch(nums, maxValue + 1, end, target);
        }
        return ans;
    }
    
    public int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    
    public int findMaxValue(int[] nums, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            else if (nums[mid] <= nums[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        } 
        return -1;
    }
}

