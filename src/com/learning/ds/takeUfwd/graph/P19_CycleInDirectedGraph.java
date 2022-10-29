package com.learning.ds.takeUfwd.graph;

import java.util.ArrayList;

public class P19_CycleInDirectedGraph {
    private static final int numOfNodes = 11;
    private static boolean[] visited = new boolean[numOfNodes + 1];
    private static boolean[] pathVisited = new boolean[numOfNodes + 1];

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = createGraph();
        for(int i = 1; i < numOfNodes; i++) {
            if(!visited[i])
                dfs(i, adjList);
        }
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList) {
        visited[node] = true;
        pathVisited[node] = true;

        ArrayList<Integer> neighborsList = adjList.get(node);
        for(int i = 0; i < neighborsList.size(); i++) {
            int tempNode = neighborsList.get(i);
            if(!visited[tempNode]) {
                dfs(tempNode, adjList);
            }
            if(visited[tempNode] && pathVisited[tempNode]) {
                System.out.println("Cycle is present.");
            }
        }
        pathVisited[node] = false;
    }

    private static ArrayList<ArrayList<Integer>> createGraph() {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numOfNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(1).add(2);
        adjList.get(2).add(3);
        adjList.get(3).add(4);
        adjList.get(3).add(7);
        adjList.get(4).add(5);
        adjList.get(5).add(6);
        adjList.get(7).add(5);
        adjList.get(8).add(2);
        adjList.get(8).add(9);
        adjList.get(9).add(10);
        adjList.get(10).add(8);

        return adjList;
    }
}
