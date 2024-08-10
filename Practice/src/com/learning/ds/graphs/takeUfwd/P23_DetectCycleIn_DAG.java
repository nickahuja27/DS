package com.learning.ds.graphs.takeUfwd;

import java.util.ArrayList;
import java.util.List;

public class P23_DetectCycleIn_DAG {
    static int numOfNode = 4;
    public static void main(String[] args) {

    }

    private static boolean dfs_detectCycle(List<List<Integer>> adjList,
                                           int node,
                                           boolean[] visited,
                                           boolean[] recursionSTack) {

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
