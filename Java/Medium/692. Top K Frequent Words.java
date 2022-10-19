class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String word:words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        List<Map.Entry<String, Integer>> l = new LinkedList<>();
        for(Map.Entry<String, Integer> e:map.entrySet()){
            l.add(e);
        }
        Collections.sort(l, new MyComparator());//just use our Comparator to sort
        System.out.println(l);
        List<String> ans = new LinkedList<>();
        for(int i = 0;i<=k-1;i++){
            ans.add(l.get(i).getKey());
        }
        return ans;
    }
}
class MyComparator implements Comparator<Map.Entry<String, Integer>> {

    public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2){
        String word1 = e1.getKey();
        int freq1 = e1.getValue();
        String word2 = e2.getKey();
        int freq2 = e2.getValue();
        if(freq1!=freq2){
            return freq2-freq1;
        }
        else {
            return word1.compareTo(word2);
        }
    }
}
