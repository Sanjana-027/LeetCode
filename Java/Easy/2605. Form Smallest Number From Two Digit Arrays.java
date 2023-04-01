class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int digit = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    digit = nums1[i];
                    return digit;
                }
            }
        }
        
        if (nums1[0] < nums2[0])
            return nums1[0] * 10 + nums2[0];
        
            return nums2[0] * 10 + nums1[0];
        
   
    }
}

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min = 10; 
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    min = Math.min(min, nums1[i]);;
                }
            }
        }
        if (min != 10) return min;
        
        int minNum1 = 10, minNum2 = 10;
        for (int i = 0; i < nums1.length; i++) {
            minNum1 = Math.min(minNum1, nums1[i]);
        }
        
        for (int i = 0; i < nums2.length; i++) {
            minNum2 = Math.min(minNum2, nums2[i]);
        }
        return minNum1 < minNum2 ? (minNum1 * 10) + minNum2 : (minNum2 * 10) + minNum1 ;
    }
}
