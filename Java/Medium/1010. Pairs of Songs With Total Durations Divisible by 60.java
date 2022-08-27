class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int count = 0;
        for(int elem : time){
            // int x = (60 - elem % 60 ) % 60;
            int modRem = elem % 60;
            int x = modRem == 0 ? 0 : 60 - modRem;
            count += hm.getOrDefault(x, 0);
            hm.put(modRem, hm.getOrDefault(modRem, 0) + 1);
        }
        return count;
    }
}
