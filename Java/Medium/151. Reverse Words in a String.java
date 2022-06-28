class Solution {
    public String reverseWords(String s) {
        String res = "";
        String[] str = s.split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            res = (res + " " + str[i]).trim();
        }
        return res;
    }
}
