class Solution {
    public int lengthOfLastWord(String s) {
        return (s.trim().length() - 1) - (s.trim().lastIndexOf(" "));
    }
}
