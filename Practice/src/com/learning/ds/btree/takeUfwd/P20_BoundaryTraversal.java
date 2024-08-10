package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

public class P20_BoundaryTraversal {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        traverse(root);
    }

    private static void traverse(TreeNode<Integer> node) {
        traverseLeft(node);
        traverseLeaves(node);
        traverseRight(node);
    }
    private static void traverseLeft(TreeNode<Integer> node) {

    }

    private static void traverseLeaves(TreeNode<Integer> node) {

    }

    private static void traverseRight(TreeNode<Integer> node) {

    }


    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(1);
        root.left = new TreeNode<Integer>(2);
        root.left.left = new TreeNode<Integer>(3);
        root.left.left.right = new TreeNode<Integer>(4);
        root.left.left.right.left = new TreeNode<Integer>(5);
        root.left.left.right.right = new TreeNode<Integer>(6);

        root.right = new TreeNode<Integer>(7);
        root.right.right = new TreeNode<Integer>(8);
        root.right.right.left = new TreeNode<Integer>(9);
        root.right.right.left.left = new TreeNode<Integer>(10);
        root.right.right.left.right = new TreeNode<Integer>(11);

        return root;
    }
}
