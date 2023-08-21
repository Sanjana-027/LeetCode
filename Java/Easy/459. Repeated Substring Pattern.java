class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length() / 2; i++) {
            boolean flag = true;
            str.append(s.charAt(i));
            if (s.length() % str.length() == 0) {
                for (String sEle : s.split(str.toString())) {
                    if (!sEle.isEmpty()) {
                        flag = false;
                        break;
                    }
                }
            }
            else flag = false;
            if (flag) return true;
        }
        return false;
    }
}
