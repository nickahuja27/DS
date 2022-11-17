package com.learning.ds.graph.takeUfwd;

import java.util.ArrayList;
import java.util.Stack;

public class P21_TopologicalSort {
    private static final int numOfNodes = 6;
    private static boolean[] visited = new boolean[numOfNodes + 1];

    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = createGraph();

        for(int i = 0; i < adjList.size(); i++) {
            if(!visited[i])
                dfs(i, adjList);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "  ");
        }
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList) {
        visited[node] = true;

        ArrayList<Integer> neighbors = adjList.get(node);
        for(int i = 0; i < neighbors.size(); i++) {
            int tempNode = neighbors.get(i);
            if(!visited[tempNode]) {
                dfs(tempNode, adjList);
            }
        }
        stack.push(node);
    }

    private static ArrayList<ArrayList<Integer>> createGraph() {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numOfNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(2).add(3);
        adjList.get(3).add(1);
        adjList.get(4).add(0);
        adjList.get(4).add(1);
        adjList.get(5).add(0);
        adjList.get(5).add(2);

        return adjList;
    }
}
