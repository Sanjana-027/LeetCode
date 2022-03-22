class Solution {
    public int maxRepeating(String sequence, String word) {
        String find = word;
        
		while (sequence.contains(find)) {
			find += word;
		}
		return (find.length() - word.length()) / word.length();
    }
}
