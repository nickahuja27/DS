package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

public class P15_IsBalanced {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        int isBalanced = isBalanced(root);
        System.out.println("Is Balanced: " + (isBalanced != -1));
    }

    private static int isBalanced(TreeNode<Integer> node) {
        return -1;
    }

    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(1);

        root.left = new TreeNode<Integer>(2);
        root.left.left = new TreeNode<Integer>(3);


        root.right = new TreeNode<Integer>(4);
        root.right.left = new TreeNode<Integer>(5);
        root.right.left.right = new TreeNode<Integer>(6);

        root.right.right = new TreeNode<Integer>(7);
        root.right.right.right = new TreeNode<Integer>(8);
        root.right.right.right = new TreeNode<Integer>(9);

        return root;
    }
}
