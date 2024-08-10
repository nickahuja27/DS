package com.learning.ds.graphs.takeUfwd;

import java.util.ArrayList;

public class P19_DetectCycle_DFS_DirectedGraph {
    private static int numOfNodes = 11;
    static boolean visited[] = new boolean[numOfNodes];
    static boolean pathVisited[] = new boolean[numOfNodes];

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = createAdjList();
        isCycle(adjList);
    }

    private static void isCycle(ArrayList<ArrayList<Integer>> adjList) {

    }

    private static void dfs(ArrayList<ArrayList<Integer>> adjList, int node) {

    }

    private static ArrayList<ArrayList<Integer>> createAdjList() {
        int V = 11;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(2).add(8);
        adj.get(3).add(4);
        adj.get(3).add(7);
        adj.get(4).add(5);
        adj.get(5).add(6);
        adj.get(7).add(5);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);
        return adj;
    }
}
