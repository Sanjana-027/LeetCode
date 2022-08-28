class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean[] flag = new boolean[magazine.length()];
        
        for (int i = 0; i < ransomNote.length(); i++) {
            int j = 0;
            while (j < magazine.length()) {
                 if (ransomNote.charAt(i) == magazine.charAt(j) && !flag[j]) {
                     flag[j] = true;
                     break;
                 }
                j++;
            }
            if (j == magazine.length())
                return false;
        }
        return true;
    }
}

// 2nd approach

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return false;
        }
        return true;
    }
}
