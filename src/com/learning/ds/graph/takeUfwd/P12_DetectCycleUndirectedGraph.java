package com.learning.ds.graph.takeUfwd;

import java.util.ArrayList;

public class P12_DetectCycleUndirectedGraph {
    private static final int numOfNodes = 8;
    private static boolean[] visited = new boolean[numOfNodes];

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = createGraph();
        dfs(1, -1, adjList);
    }

    private static void dfs(int node, int parentNode, ArrayList<ArrayList<Integer>> adjList) {
        visited[node] = true;

        ArrayList<Integer> neighborsList = adjList.get(node);
        for(int i = 0; i < neighborsList.size(); i++) {
            int tempNode = neighborsList.get(i);
            if(tempNode != parentNode && visited[tempNode]) {
                System.out.println("Cycle Detected.");
            }
            else if(tempNode != parentNode && !visited[tempNode]) {
                dfs(tempNode, node, adjList);
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> createGraph() {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numOfNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(1).add(2);
        adjList.get(1).add(3);

        adjList.get(2).add(1);
        adjList.get(2).add(5);

        adjList.get(3).add(1);
        adjList.get(3).add(4);
        adjList.get(3).add(7);

        adjList.get(4).add(3);

        adjList.get(5).add(2);
        adjList.get(5).add(7);

        adjList.get(6).add(3);
        adjList.get(6).add(7);

        adjList.get(7).add(5);
        adjList.get(7).add(6);

        return adjList;
    }
}
