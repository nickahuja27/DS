package com.learning.ds.btree.takeUfwd;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Traversals {
    public static void main(String[] args) {
        TreeNode<Integer> root = BinaryTree.create();
//        preOrder(root);
//        System.out.println();
//        inOrder(root);
//        System.out.println();
//        postOrder(root);
//        System.out.println();
        levelOrder(root);
    }

    public static void preOrder(TreeNode<Integer> node) {
        if(node == null)
            return;

        System.out.print(node.value + "  ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(TreeNode<Integer> node) {
        if(node == null)
            return;

        inOrder(node.left);
        System.out.print(node.value + "  ");
        inOrder(node.right);
    }

    public static void postOrder(TreeNode<Integer> node) {
        if(node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + "  ");
    }

    public static void levelOrder(TreeNode<Integer> node) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode<Integer> tempNode = queue.poll();
            System.out.print(tempNode.value + "  ");
            if(tempNode.left != null)
                queue.add(tempNode.left);
            if(tempNode.right != null)
                queue.add(tempNode.right);
        }
    }
}
