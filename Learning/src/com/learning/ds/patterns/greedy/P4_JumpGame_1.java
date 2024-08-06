package com.learning.ds.patterns.greedy;

public class P4_JumpGame_1 {
    public static void main(String[] args) {
        int[] jumps = {3,2,1,0,4};
        findJumps(jumps, 0);
    }

    private static void findJumps(int[] jumps, int indexReachedSoFar) {
        if(indexReachedSoFar >= jumps.length - 1) {
            System.out.println("You can reach in the end");
            return;
        }
        if(jumps[indexReachedSoFar] == 0)
            return;

        for(int i = indexReachedSoFar; i < indexReachedSoFar + jumps[indexReachedSoFar]; i++) {
            findJumps(jumps, i + 1);
        }
    }
}
