package com.learning.ds.takeUfwd.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class P38_CheapestFlightsWithin_K_Stops {
  private static final int numOfNodes = 5;
  private static final int SRC_NODE = 0;
  private static final int END_NODE = 5;
  private static boolean[] visited = new boolean[numOfNodes];
  private static int[] costs = new int[numOfNodes];
  private static final int STOPS = 2;

  public static void main(String[] args) {
    Arrays.fill(costs, Integer.MAX_VALUE);
    ArrayList<ArrayList<Pair>> adjList = createGraph();
    findCheapestFlight(adjList);
    System.out.println(Arrays.toString(costs));
  }

  private static void findCheapestFlight(ArrayList<ArrayList<Pair>> adjList) {
    Pair srcPair = new Pair(SRC_NODE, 0, 0);
    //Note here, we are comparing stops and not weights.
    PriorityQueue<Pair> pQueue = new PriorityQueue<Pair>((e1, e2) -> e1.stops - e2.stops);
    pQueue.add(srcPair);
    costs[SRC_NODE] = 0;

    while (!pQueue.isEmpty()) {
      Pair tempPair = pQueue.poll();
      visited[tempPair.nodeValue] = true;

      if (tempPair.stops <= STOPS) {
        ArrayList<Pair> neighbors = adjList.get(tempPair.nodeValue);
        for (int i = 0; i < neighbors.size(); i++) {
          Pair neighbor = neighbors.get(i);
          int oldValue = costs[neighbor.nodeValue];
          int newValue = costs[tempPair.nodeValue] + neighbor.weight;
          costs[neighbor.nodeValue] = Math.min(oldValue, newValue);

          if (!visited[neighbor.nodeValue]) {
            pQueue.add(new Pair(neighbor.nodeValue, neighbor.weight, tempPair.stops + 1));
          }
        }
      }
    }
  }

  public static class Pair {
    public int nodeValue;
    public int weight;
    public int stops;

    public Pair(int nodeValue, int weight, int stops) {
      this.nodeValue = nodeValue;
      this.weight = weight;
      this.stops = stops;
    }
  }

  public static ArrayList<ArrayList<Pair>> createGraph() {
    ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();
    for (int i = 0; i < numOfNodes; i++) {
      adjList.add(new ArrayList<>());
    }

    adjList.get(0).add(new Pair(1, 5, 0));
    adjList.get(0).add(new Pair(3, 2, 0));

    adjList.get(3).add(new Pair(1, 2, 0));

    adjList.get(1).add(new Pair(2, 5, 0));
    adjList.get(1).add(new Pair(4, 1, 0));

    adjList.get(4).add(new Pair(2, 1, 0));

    return adjList;
  }
}
