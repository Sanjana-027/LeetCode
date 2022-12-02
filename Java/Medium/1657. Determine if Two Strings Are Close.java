class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        HashSet<Character> hs = new HashSet<Character>();

        for (char ch : word1.toCharArray()) {
            freq1[ch - 'a']++;
            hs.add(ch);
        }
        for (char ch : word2.toCharArray()) {
            freq2[ch - 'a']++;
            if (!hs.contains(ch)) return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) return false;
        } 

        return true;
    }
}

// [2, 3, 1, 0, 0.....]
// [1, 2, 3, 0, 0.....]
