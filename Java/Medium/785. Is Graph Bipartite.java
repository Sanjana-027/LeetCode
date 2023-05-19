class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        Arrays.fill(colors, -1);
        for(int u = 0; u < graph.length; u++){
            if(colors[u] == -1){
                if(!dfs(u, graph, colors, 1)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean dfs(int u, int[][]graph, int[]colors, int col){
        if (colors[u] == 1 - col){
            return false; 
        } 
        if (colors[u] == col) {
            return true; 
        }
        colors[u] = col;
        for (var neighbor: graph[u]) {
            if (!dfs(neighbor, graph, colors, 1 - col)) {
                return false;
            }
        }
        return true;
    }
}
