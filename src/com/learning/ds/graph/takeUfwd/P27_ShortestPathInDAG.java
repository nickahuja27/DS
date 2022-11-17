package com.learning.ds.graph.takeUfwd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Because we are using a DIRECTED GRAPH, we have to find the order and hence Topo Sort
 */
public class P27_ShortestPathInDAG {
  private static final int numOfNodes = 7;
  private static boolean[] visited = new boolean[numOfNodes];
  private static int[] distance = new int[numOfNodes];
  private static Stack<Integer> sortOrderStack = new Stack<>();
  private static final int SRC_NODE = 6;
  private static final int END_NODE = 3;

  public static void main(String[] args) {
    Arrays.fill(distance, Integer.MAX_VALUE);
    ArrayList<ArrayList<WeightedEdge>> adjList = createGraph();
    topoSort(SRC_NODE, adjList);
    System.out.println(sortOrderStack);
    findMinDistance(adjList);
    System.out.println(Arrays.toString(distance));
    System.out.println("Shorted distance to end node: " + distance[END_NODE]);
  }

  private static void findMinDistance(ArrayList<ArrayList<WeightedEdge>> adjList) {
    distance[SRC_NODE] = 0;
    while (!sortOrderStack.isEmpty()) {
      int node = sortOrderStack.pop();

      ArrayList<WeightedEdge> neighbors = adjList.get(node);
      for(int i = 0; i < neighbors.size(); i++) {
        WeightedEdge neighbor = neighbors.get(i);
        int oldDistance = distance[neighbor.nodeValue];
        int newValue = distance[node] + neighbor.weight;
        distance[neighbor.nodeValue] = Math.min(oldDistance, newValue);
      }
    }
  }

  private static void topoSort(int node, ArrayList<ArrayList<WeightedEdge>> adjList) {
    visited[node] = true;

    ArrayList<WeightedEdge> neighbors = adjList.get(node);
    for(int i = 0; i < neighbors.size(); i++) {
      WeightedEdge neighbor = neighbors.get(i);
      if(!visited[neighbor.nodeValue]) {
        topoSort(neighbor.nodeValue, adjList);
      }
    }
    sortOrderStack.push(node);
  }

  public static ArrayList<ArrayList<WeightedEdge>> createGraph() {
    ArrayList<ArrayList<WeightedEdge>> adjList = new ArrayList<>();
    for (int i = 0; i < numOfNodes; i++) {
      adjList.add(new ArrayList<>());
    }

    adjList.get(0).add(new WeightedEdge(1, 2));
    adjList.get(1).add(new WeightedEdge(3, 1));
    adjList.get(2).add(new WeightedEdge(3, 3));

    adjList.get(4).add(new WeightedEdge(0, 3));
    adjList.get(4).add(new WeightedEdge(2, 1));

    adjList.get(5).add(new WeightedEdge(4, 1));

    adjList.get(6).add(new WeightedEdge(4, 2));
    adjList.get(6).add(new WeightedEdge(5, 3));

    return adjList;
  }
}
