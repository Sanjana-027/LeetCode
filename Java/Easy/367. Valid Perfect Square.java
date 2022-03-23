class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1, end = num;
        while (start <= end) {  
            int mid = start + (end - start) / 2;
            int division = num / mid, remain = num % mid;
            if (division == mid && remain == 0) 
                return true;
            else if (division < mid) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;  
    }
}
