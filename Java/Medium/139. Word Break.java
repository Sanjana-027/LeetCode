class Solution {
    HashMap<String, Boolean> memo = new HashMap<String, Boolean>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0)
			return true;

		if (memo.containsKey(s))
			return memo.get(s);

		for (int i = 0; i < wordDict.size(); i++) {
			if (s.indexOf(wordDict.get(i)) == 0) {
				String suffix = s.substring(wordDict.get(i).length());
				if (wordBreak(suffix, wordDict)) {
					memo.put(s, true);
					return true;
				}
			}
		}
		memo.put(s, false);
		return false;
    }
}
