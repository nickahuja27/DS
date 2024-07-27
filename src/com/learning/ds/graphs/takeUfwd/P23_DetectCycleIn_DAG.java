package com.learning.ds.graphs.takeUfwd;

import java.util.ArrayList;
import java.util.List;

public class P23_DetectCycleIn_DAG {
    static int numOfNode = 4;
    public static void main(String[] args) {
        boolean[] visited = new boolean[numOfNode];
        boolean[] recursionSTack = new boolean[numOfNode];
        List<List<Integer>> adjList = createGraph();
        for(int i = 0; i < numOfNode; i++) {
            if(!visited[i]) {
                boolean isCycle = dfs_detectCycle(adjList, i, visited, recursionSTack);
                System.out.println("Cycle Present: " + isCycle);
            }
        }
    }

    private static boolean dfs_detectCycle(List<List<Integer>> adjList,
                                           int node,
                                           boolean[] visited,
                                           boolean[] recursionSTack) {
        if(visited[node] && recursionSTack[node]) return true;
        if(visited[node]) return false;

        visited[node] = true;
        recursionSTack[node] = true;
        List<Integer> neighbors = adjList.get(node);
        for(int neighbor : neighbors) {
            boolean isCycle = dfs_detectCycle(adjList, neighbor, visited, recursionSTack);
            return isCycle;
        }
        recursionSTack[node] = false;
        return false;
    }


    private static List<List<Integer>> createGraph() {
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < numOfNode; i++) {
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(1);
        adjList.get(1).add(2);
        adjList.get(2).add(3);
        adjList.get(3).add(0);

        return adjList;
    }
}
