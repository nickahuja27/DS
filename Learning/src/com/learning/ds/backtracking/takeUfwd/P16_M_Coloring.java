package com.learning.ds.backtracking.takeUfwd;

import java.util.ArrayList;
import java.util.List;

public class P16_M_Coloring {
    private static int numOfNodes = 4;
    private static int numOfColors = 3;
    private static int[] nodeColors = new int[numOfNodes];

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = createGraph();
        boolean canColor = colorNodes(0, adjList);
        System.out.println("Can Color: " + canColor);
    }

    private static boolean colorNodes(int node, ArrayList<ArrayList<Integer>> adjList) {
        if(node > numOfNodes)
            return true;

        List<Integer> neighbors = adjList.get(node);
        for(int neighbor : neighbors) {

        }
        return false;
    }

    private static boolean isSafe(int node, int color, ArrayList<ArrayList<Integer>> adjList) {
        ArrayList<Integer> neighbors = adjList.get(node);
        for(int i = 0; i < neighbors.size(); i++) {
            if(nodeColors[neighbors.get(i)] == color) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<ArrayList<Integer>> createGraph() {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numOfNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(2);
        adjList.get(3).add(0);
        adjList.get(0).add(3);
        adjList.get(0).add(2);
        adjList.get(2).add(0);

        return adjList;
    }
}
