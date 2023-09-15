class Solution {

    class UnionFind {
        int[] parents;
        int cnt;

        public UnionFind(int n) {
            this.parents = new int[n];
            for (int i = 0; i < n; i++) {
                parents[i] = i;
            }
            cnt = n;
        }

        public int find(int x) {
            if (parents[x] == x) {
                return x;
            }
            parents[x] = find(parents[x]);
            return parents[x];
        }

        public boolean union(int x1, int x2) {
            int y1 = find(x1), y2 = find(x2);
            if (y1 == y2) {
                return true;
            }
            cnt--;
            parents[y1] = y2;
            return false;
        }

        public boolean isConnected() {
            return cnt == 1;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int res = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((int[] arr1, int[] arr2) -> arr1[2] - arr2[2]);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int distance = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                pq.offer(new int[]{i, j, distance});
            }
        }
        UnionFind uf = new UnionFind(n);
        while (!uf.isConnected()) {
            int[] arr = pq.poll();
            if (!uf.union(arr[0], arr[1])) {
                res += arr[2];
            }
        }
        return res;
    }
}
