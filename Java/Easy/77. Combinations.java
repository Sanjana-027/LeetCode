class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), n, k, 1); 
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> templist , int n , int k, int start) {
        if(templist.size() == k) {
            list.add(new ArrayList<>(templist));
            return;
        }

        for(int i = start; i <= n; i++){
            templist.add(i);
            backtrack(list, templist, n, k, i + 1);
            templist.remove(templist.size() - 1);
        }
    }   
}

