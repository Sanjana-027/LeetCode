class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length(); 
        
        for(int i = 0; i < l1 - l2 + 1; i++){
            if(haystack.substring(i, i + l2).equals(needle)){
                return i;
            }
        }
        
        return -1;
        
    }
}
