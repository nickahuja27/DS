package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

import java.util.HashMap;

public class P24_RightView {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        HashMap<Integer, Integer> viewMap = new HashMap<>();
        printRightView(root, viewMap, 0);
        System.out.println(viewMap);
    }

    private static void printRightView(TreeNode<Integer> node, HashMap<Integer, Integer> viewMap, int counter) {

    }

    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(1);
        root.left = new TreeNode<Integer>(2);
        root.left.left = new TreeNode<Integer>(4);
        root.left.right = new TreeNode<Integer>(5);
        root.left.right.left = new TreeNode<Integer>(6);

        root.right = new TreeNode<Integer>(3);
        root.right.right = new TreeNode<Integer>(7);

        return root;
    }
}
