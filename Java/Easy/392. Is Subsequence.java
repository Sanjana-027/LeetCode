class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;
        while (i < t.length() && j < s.length()) {
            
            if (s.charAt(j) == t.charAt(i))
                j++;
                
            i++;
        }
        return j == s.length(); 
    }
}
//      j               i
//  a b c     a h b g d c

//  res = ab
