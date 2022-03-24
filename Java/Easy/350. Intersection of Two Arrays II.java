class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, sizeCount = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    temp.add(nums1[i]);
                    i++; j++; sizeCount++;
                }
                else if (nums1[i] < nums2[j]) i++;
                else j++;
            }

        int[] res = new int[sizeCount];
        for (int k = 0; k < temp.size(); k++) {
                res[k] = temp.get(k);
        }
        return res;
    }
}
