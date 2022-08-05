lass Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
    
    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// 2nd Approach

class Solution {
    public boolean validPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1, true);
    }
    
    private boolean isPalindrome(String s, int start, int end, boolean flag) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                if(flag)
                    return isPalindrome(s, start + 1, end, false) || isPalindrome(s, start, end - 1, false);
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
