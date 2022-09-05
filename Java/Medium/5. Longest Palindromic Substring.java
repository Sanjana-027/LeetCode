class Solution {
    public String longestPalindrome(String s) {
        String rslt = "";
        
        for (int i = 0; i < s.length(); i++) {
            String s1 = expandAroundCenter(s, i, i);//a
            String s2 = expandAroundCenter(s, i, i + 1);
            rslt = s1.length() > rslt.length()? s1 : rslt;//b
            rslt = s2.length() > rslt.length()? s2 : rslt;
        }
        return rslt;
    }

    private String expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return s.substring(L + 1, R);// 0,2
    }
}

// babad
//   0, 1  
// //b, a

