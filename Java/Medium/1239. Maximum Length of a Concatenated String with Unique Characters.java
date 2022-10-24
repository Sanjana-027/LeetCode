class Solution {
    int max = 0;
    public int maxLength(List<String> arr) {
        dfs(arr, 0, "");
        return max;
    }
    
    public void dfs(List<String> arr, int start, String res) {
        if (!isUnique(res)) return;
        
        max = Math.max(res.length(), max);
        
        for (int i = start; i < arr.size(); i++) {
            String s = arr.get(i);
            dfs(arr, i + 1, res + s);
        }
        
    }
    
    public static boolean isUnique(String s) {
        Set<Character> set = new HashSet<Character>();
        
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}


// un
// uniq
// unique
// unue
// iq
