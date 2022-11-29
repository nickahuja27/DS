package com.template.ds.graph.takeUfwd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Because this is a UN DIRECTED Graph, we can use BFS to find shortest path.
 * In BFS we always use a Queue data structure.
 * There is no need for Topo Sort here.
 * Also think about nodes that are unreachable. Set them to -1.
 */
public class P28_ShortestPathInUnDirectedGraph {
  private static final int numOfNodes = 9;
  private static boolean[] visited = new boolean[numOfNodes];
  private static int[] distance = new int[numOfNodes];
  private static final int SRC_NODE = 0;
  private static final int END_NODE = 8;

  public static void main(String[] args) {
    Arrays.fill(distance, Integer.MAX_VALUE);
    distance[SRC_NODE] = 0;
    findShortedPath(createGraph());
    System.out.println(Arrays.toString(distance));
    System.out.println("Shorted distance to end node: " + distance[END_NODE]);
  }

  private static void findShortedPath(ArrayList<ArrayList<Integer>> adjList) {

  }

  private static ArrayList<ArrayList<Integer>> createGraph() {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    for (int i = 0; i < numOfNodes; i++) {
      adjList.add(new ArrayList<>());
    }
    adjList.get(0).add(1);
    adjList.get(0).add(3);

    adjList.get(1).add(0);
    adjList.get(1).add(2);
    adjList.get(1).add(3);

    adjList.get(2).add(1);
    adjList.get(2).add(6);

    adjList.get(3).add(0);
    adjList.get(3).add(4);

    adjList.get(4).add(3);
    adjList.get(4).add(5);

    adjList.get(5).add(4);
    adjList.get(5).add(6);

    adjList.get(6).add(2);
    adjList.get(6).add(5);
    adjList.get(6).add(7);
    adjList.get(6).add(8);

    adjList.get(7).add(6);
    adjList.get(7).add(8);

    adjList.get(8).add(6);
    adjList.get(8).add(7);

    return adjList;
  }

}
