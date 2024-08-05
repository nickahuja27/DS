package com.learning.ds.leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class P093_RestoreIPAddresses {
    public static void main(String[] args) {
        String inStr = "25525511135";
        List<String> ipsList = new ArrayList<>();
        findIPs(inStr, 0, ipsList);
        System.out.println("---------------------");
        findIPs("0000", 0, ipsList);
        System.out.println("---------------------");
        findIPs("101023", 0, ipsList);
    }

    private static void findIPs(String inStr, int index, List<String> ipsList) {
        if(index > inStr.length()) return;
        if(index > inStr.length() && ipsList.size() == 4) return;
        if(index == inStr.length() && ipsList.size() == 4) {
            System.out.println(ipsList);
            return;
        }

        for(int i = index; (i < inStr.length()) && (i < index + 3); i++) {
            if(isValidValue(inStr.substring(index, i + 1))) {
                ipsList.add(inStr.substring(index, i + 1));
                findIPs(inStr, i + 1, ipsList);
                ipsList.remove(ipsList.size() - 1);
            }
        }
    }

    private static boolean isValidValue(String inString) {
        if(inString == null || (inString.charAt(0) == '0' && inString.length() > 1)) return false;
        int value = Integer.parseInt(inString);
        if(value >= 0 && value <= 255)
            return true;
        return false;
    }
}
