public class Solution {
    int count = 0;
    public int countArrangement(int N) {
        boolean[] visited = new boolean[N + 1];
        calculate(N, 1, visited);
        return count;
    }
    public void calculate(int N, int pos, boolean[] visited) {
        if (pos - 1 == N) {
            count++;
            return;
        }
        
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                calculate(N, pos + 1, visited); 
                visited[i] = false;
            }
        }
    }
}




// 2nd Approach


class Solution {
    int count = 0;
    public int countArrangement(int n) {
        int[] perm = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i + 1;
        }
        backtrack(perm, new ArrayList<>(), new boolean[perm.length]);
        return count;
    }

    private void backtrack(int[] perm, List<Integer> currResult, boolean[] used) {

        if (currResult.size() == perm.length) {
            count++;
            return;
        }

        for (int i = 0; i < perm.length; i++) {
            if (used[i])
                continue;
            if (((perm[i] % (currResult.size() + 1) == 0) || ((currResult.size() + 1) % perm[i] == 0))) {
                currResult.add(perm[i]);
                used[i] = true;
                backtrack(perm, currResult, used);
                used[i] = false;
                currResult.remove(currResult.size() - 1);
            }
        }
    }
}
