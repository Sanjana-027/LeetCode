class Solution {
    public String reverseWords(String s) {
        String[] stringArr = s.split(" ");
		String res = "";
		for (String word : stringArr) {
			res += reverse(word);
		}
		return res.trim();
	}

	public String reverse(String s) {
		String rev = " ";
		int l = 0, r = s.length();
		while (r-- > 0) {
			rev += s.charAt(r);
		}
		return rev;
    }
}
