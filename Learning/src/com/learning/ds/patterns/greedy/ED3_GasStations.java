package com.learning.ds.patterns.greedy;

// https://www.educative.io/courses/grokking-coding-interview-patterns-java/gas-stations
public class ED3_GasStations {
    public static void main(String[] args) {
        int[] gasStations = {1,2,3,4,5};
        int[] costs = {3,4,5,1,2};
        findGasStationIndex(gasStations, costs);
    }

    private static void findGasStationIndex(int[] gasStations, int[] costs) {
        for(int i = 0; i < gasStations.length; i++) {
            int currCapacity = 0;
            boolean[] visited = new boolean[gasStations.length];
            int currGasStation = i;
            for(int j = 0; j < gasStations.length; j++) {
                visited[currGasStation] = true;
                currCapacity += gasStations[currGasStation] - costs[currGasStation];
                if(currCapacity < 0)
                    break;
                if(currGasStation == gasStations.length - 1) {
                    currGasStation = 0;
                } else {
                    currGasStation++;
                }
                if(visited[currGasStation]) {
                    System.out.println("Index is: " + currGasStation);
                }
            }

        }
    }
}
