package com.learning.ds.takeUfwd.btree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P20_ZigZag {
    public static void main(String[] args) {
        TreeNode<Integer> root = BinaryTree.create();
        traverse(root);
    }

    public static void traverse(TreeNode<Integer> node) {
        boolean lFlag = true;
        Stack<TreeNode<Integer>> leftStack = new Stack<>();
        Stack<TreeNode<Integer>> rightStack = new Stack<>();
        leftStack.add(node);
        while (!leftStack.isEmpty() || !rightStack.isEmpty()) {
            if(lFlag) {
                TreeNode<Integer> tempNode = leftStack.pop();
                System.out.print(tempNode.value + " ");

                if(tempNode.left != null)
                    rightStack.add(tempNode.left);
                if(tempNode.right != null)
                    rightStack.add(tempNode.right);

                if(leftStack.isEmpty())
                    lFlag = !lFlag;
            } else {
                TreeNode<Integer> tempNode = rightStack.pop();
                System.out.print(tempNode.value + " ");

                if(tempNode.right != null)
                    leftStack.add(tempNode.right);
                if(tempNode.left != null)
                    leftStack.add(tempNode.left);

                if(rightStack.isEmpty())
                    lFlag = !lFlag;
            }
        }
    }
}
