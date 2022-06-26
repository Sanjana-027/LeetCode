class Solution {
    HashMap<String, ArrayList<String>> memo = new HashMap<String, ArrayList<String>>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        ArrayList<String> res = new ArrayList<String>();

		if (s.length() == 0) {
			res.add("");
			return res;
		}

		if (memo.containsKey(s))
			return memo.get(s);

		for (String word : wordDict) {
			if (s.startsWith(word)) {
				List<String> suffix = wordBreak(s.substring(word.length()), wordDict);
				for (String sub : suffix) {
					res.add((word + " " + sub).trim());
				}
			}
		}
		memo.put(s, res);
		return res;
    }
}
