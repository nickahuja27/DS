package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

public class P27_LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        int ancestor = find(root, 4, 6);
        System.out.println("Ancestor is: " + ancestor);

    }

    public static int find(TreeNode<Integer> node, int num1, int num2) {
        if(node == null)
            return -1;

        if(node.value == num1 || node.value == num2)
            return node.value;

        int lValue = find(node.left, num1, num2);
        int rValue = find(node.right, num1, num2);
        if(lValue != -1 && rValue != -1) {
            return node.value;
        } else if(lValue != -1){
            return lValue;
        } else if(rValue != -1) {
            return rValue;
        }
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
