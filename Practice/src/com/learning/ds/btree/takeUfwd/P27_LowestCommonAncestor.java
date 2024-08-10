package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

public class P27_LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        int ancestor = find(root, 4, 6);
        System.out.println("Ancestor is: " + ancestor);
        int ancestor2 = find(root, 2, 6);
        System.out.println("Ancestor is: " + ancestor2);

    }

    private static int find(TreeNode<Integer> node, int num1, int num2) {

        return -1;
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
