class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
         int ruleKeyIndex = getRulekey(ruleKey);
        int count = 0;
        for (List<String> item : items) {
            if (ruleValue.equals(item.get(ruleKeyIndex))) {
                count++;
            }
        }
        return count;
    }
    
    public int getRulekey(String ruleKey) {
        if ("type".equals(ruleKey)) {
            return 0;
        } 
        if ("color".equals(ruleKey)) {
            return 1;
        }
        return 2;   
    }
}
