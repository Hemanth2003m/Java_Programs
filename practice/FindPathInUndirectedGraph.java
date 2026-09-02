package practice;

import java.util.*;

public class FindPathInUndirectedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean[] visited = new boolean[n];
        System.out.println(dfs(adj, visited, start, end) ? "Yes" : "No");
    }

    private static boolean dfs(List<List<Integer>> adj, boolean[] visited, int curr, int target) {
        System.out.println(curr) ;  	
        if (curr == target) return true;
        visited[curr] = true;
        for (int neighbor : adj.get(curr)) {
            if (!visited[neighbor]) {
                if (dfs(adj, visited, neighbor, target)) return true;
            }
        }
        return false;
    }
}