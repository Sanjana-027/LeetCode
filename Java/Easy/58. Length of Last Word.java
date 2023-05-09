class Solution {
    public int lengthOfLastWord(String s) {
        return (s.trim().length() - 1) - (s.trim().lastIndexOf(" "));
    }
}

// 2nd Approach

class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] arr = s.split(" ");

        return arr[arr.length - 1].length();

    }
}

