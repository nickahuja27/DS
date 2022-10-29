package com.learning.ds.takeUfwd.btree;

import com.learning.ds.TreeNode;

public class P26_RootToNodePath {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        String strSoFar = "";
        print(root,6, "");
        System.out.println(strSoFar);
    }

    public static void print(TreeNode<Integer> node, int numToFind, String strSoFar) {
        if(node == null)
            return;

        strSoFar += node.value;
        if(node.value == numToFind) {
            System.out.println(strSoFar);
            return;
        }
        print(node.left, numToFind, strSoFar);
        print(node.right, numToFind, strSoFar);
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
