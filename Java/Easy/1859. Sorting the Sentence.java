class Solution {
    public String sortSentence(String s) {
     String[] str = s.split(" ");
		String[] resArr = new String[str.length];
		String res = "";
		int i = 0;
		for (String elem : str) {
			i = (int) (elem.charAt(elem.length() - 1) - '0');
			resArr[i - 1] = elem.substring(0, elem.length() - 1);
		}
		for (i = 0; i < resArr.length; i++)
			res += resArr[i] + " ";
		return res.trim();
    }
}
