class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int[] arr = new int[26];

        for (int i = 1; i <= 26; i++) {
            arr[i - 1] = i;
        }
        for (int i = 0; i < chars.length(); i++) {
            arr[chars.charAt(i) - 'a'] = vals[i];
        }

        int max = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += arr[s.charAt(i) - 'a'];
            if (sum < 0) sum = 0;
            
            if (sum > max) {
                max = sum;
            }
                          
        }

        return max;
    }
}
