class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character, Integer> res = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res.put(c, res.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
            if (res.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}

// 2nd approach 

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i ++) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
