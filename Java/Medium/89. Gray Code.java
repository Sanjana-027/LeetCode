class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int range = (int)Math.pow(2, n);
        for(int i = 0; i < range; i++) {
            int copy = i >> 1;
            ans.add(i ^ copy);
        }
        
        return ans;
    }
}
    // 00  00
    // 01  01
    // 10  11
    // 11  10
