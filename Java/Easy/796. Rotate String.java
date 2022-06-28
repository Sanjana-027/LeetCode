class Solution {
    public boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            if (s.equals(goal)) {
                return true;
            }
            String suffix = s.substring(0, 1);
            String prefix = s.substring(1);
            s = prefix + suffix;
        }
        return false;
    }
}
