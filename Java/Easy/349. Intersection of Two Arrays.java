class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        int count = 0;
        for (int num : nums1) {
            if (temp[num] != 1) {
                temp[num] = 1;
            }
        }
        for (int num : nums2) {
            if (temp[num] == 1) {
                temp[num] = 2;
                count++;
            }
        }
        
        int[] res = new int[count];
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 2) {
                res[index++] = i;
            }
        }
        return res;
    }
}
