package com.learning.ds.takeUfwd.btree;

import com.learning.ds.TreeNode;

public class P41_CeilBinarySearchTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        int ceil = findCeil(root, 8);
        System.out.println("Ceil is: " + ceil);
    }

    public static int findCeil(TreeNode<Integer> node, int key) {
        int ceil = -1;
        while (node != null) {
            if(key < node.value) {
                if(node.left == null) {
                    ceil = node.value;
                }
                node = node.left;
            } else {
                node = node.right;
            }
        }

        return ceil;
    }

    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(10);
        root.left = new TreeNode<Integer>(5);
        root.left.left = new TreeNode<Integer>(3);
        root.left.right = new TreeNode<Integer>(6);
        root.left.left.left = new TreeNode<Integer>(2);
        root.left.left.right = new TreeNode<Integer>(4);
        root.left.right.right = new TreeNode<Integer>(9);


        root.right = new TreeNode<Integer>(13);
        root.right.left = new TreeNode<Integer>(11);
        root.right.right = new TreeNode<Integer>(14);

        return root;
    }
}
