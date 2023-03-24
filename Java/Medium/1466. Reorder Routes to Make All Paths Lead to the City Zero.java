class Solution {
    class Graph {
        private int V;
        private List<ArrayList<Integer>> adj;

        public Graph(int v) {
            this.V = v;
            this.adj = new ArrayList<ArrayList<Integer>>(this.V);
            for (int i = 0; i < this.V; ++i)
                this.adj.add(new ArrayList<Integer>());
        }

        public void addEdge(int u, int v) {
            adj.get(u).add(v);
        }

        public int bfs(int s, boolean[] visited, Set<String> set) {
            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.offer(s);
            visited[s] = true;
            int count = 0;
            while (!queue.isEmpty()) {
                s = queue.poll();
                for (int v : adj.get(s)) {
                    if (!visited[v]) {
                        visited[v] = true;
                        if (!set.contains(v+"#"+s))
                            count++;
                        queue.offer(v);
                    }
                }
            }
            return count;
        }
    }
    public int minReorder(int n, int[][] connections) {
        Graph graph = new Graph(n);
        Set<String> set = new HashSet();
        for(int[] edge : connections){
            graph.addEdge(edge[0], edge[1]);
            graph.addEdge(edge[1], edge[0]);
            set.add(edge[0]+"#"+edge[1]);
        }
        boolean[] visited = new boolean[n];
        return graph.bfs(0, visited, set);
    }
}
