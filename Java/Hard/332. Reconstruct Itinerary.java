class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for(List<String> li: tickets){
            String s1 = li.get(0);
            String s2 = li.get(1);
            if(!map.containsKey(s1)){
                PriorityQueue<String> pq = new PriorityQueue<>();
                map.put(s1,pq);
            }
            map.get(s1).add(s2);
        }
        LinkedList<String> list = new LinkedList<>();
        dfs("JFK", map, list);
        return list;
    }
    private void dfs(String s, Map<String, PriorityQueue<String>> map, LinkedList<String> list){
        PriorityQueue<String> pq = map.get(s);
        while(pq != null && !pq.isEmpty()){
            dfs(pq.poll(),map,list);
        }
        list.addFirst(s);
    }
}


        
