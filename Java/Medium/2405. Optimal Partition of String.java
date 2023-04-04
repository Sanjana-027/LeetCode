class Solution {
    public int partitionString(String s) {
        boolean[] flags = new boolean[26];
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            if (flags[s.charAt(i) - 'a'] == false) {
                flags[s.charAt(i) - 'a'] = true;
                i++;
            }
            else {
                count++;
                int j = 0;
                while(j <= 25) {
                    flags[j] = false;
                    j++;
                }    
            }
        }
        return count + 1;
    }
}
