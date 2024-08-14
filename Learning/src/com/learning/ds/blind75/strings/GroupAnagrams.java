package com.learning.ds.blind75.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String inStrs[] = {"eat","tea","tan","ate","nat","bat"};
        findGroups(inStrs);
    }

    private static void findGroups(String[] inStrs) {
        HashMap<String, ArrayList<String>> groupsMap = new HashMap<>();
        for (int i = 0; i < inStrs.length; i++) {
            char[] strChars = inStrs[i].toCharArray();
            Arrays.sort(strChars);
            String sortedStr = new String(strChars);
            ArrayList<String> groupsList = groupsMap.getOrDefault(sortedStr, new ArrayList<>());
            groupsList.add(inStrs[i]);
            groupsMap.put(sortedStr, groupsList);
        }

        System.out.println(groupsMap);
    }
}
