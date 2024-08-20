package com.learning.ds.leetcode;

import com.learning.ds.TreeNode;

public class P230_KthSmallestElementInBST {
    private static int counter = 0;
    public static void main(String[] args) {
        int kthElement = kthSmallest(create(), 3);
        System.out.println(kthElement);
    }

    public static int kthSmallest(TreeNode<Integer> root, int k) {
        if(root == null) return -1;

        int left = kthSmallest(root.left, k);
        if(left != -1) {
            return left;
        }
        counter++;
        if(counter == k) {
            System.out.println(root.value);
            return root.value;
        }
        return kthSmallest(root.right, k);
    }
    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(5);

        root.left = new TreeNode<Integer>(3);
        root.left.left = new TreeNode<Integer>(2);
        root.left.left.left = new TreeNode<Integer>(1);
        root.left.right = new TreeNode<Integer>(4);

        root.right = new TreeNode<Integer>(6);


        return root;
    }
}
