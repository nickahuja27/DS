package com.learning.ds.graphs.takeUfwd;

import java.util.*;

public class P28_ShortestPathInUndirectedGraphWithUnitWeights {
    static int numOfNodes = 9;
    static int distance[] = new int[numOfNodes];
    static boolean visited[] = new boolean[numOfNodes];

    public static void main(String[] args) {
        List<List<Integer>> adjList = createGraph();
        Arrays.fill(distance, Integer.MAX_VALUE);
        findShortestDistance(adjList, 0);
        System.out.println("Distances : " + Arrays.toString(distance));
    }

    private static void findShortestDistance(List<List<Integer>> adjList, int srcNode) {

    }
    private static List<List<Integer>> createGraph() {
        int[][] edge = {{0,1},{0,3},{3,4},{4,5},{5,6},{1,2},{2,6},{6,7},{7,8},{6,8}};
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < edge.length; i++) {
            adjList.add(new ArrayList<>());
        }
        for(int i = 0; i < edge.length; i++) {
            adjList.get(edge[i][0]).add(edge[i][1]);
        }

        return adjList;
    }
}
