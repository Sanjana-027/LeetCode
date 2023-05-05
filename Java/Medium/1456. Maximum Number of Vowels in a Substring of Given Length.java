class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int temp = k;
        int j = 0, i = 0;

        while (j < temp) {
            char ch = s.charAt(j);
            count += checkVowel(s.charAt(j));
            j++;
        }
        int max = count;

        while (j < s.length()) {            
            
            char ch = s.charAt(j);
            count += checkVowel(s.charAt(j));
            ch = s.charAt(i);
            count -= checkVowel(s.charAt(i));
            j++;
            i++;
            max  = Math.max(count, max);
        }

    
        return max;
    }
    private int checkVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                return 1;
                
        }
        return 0;
    }
}
//  i j
// aeciiidef
// 2
