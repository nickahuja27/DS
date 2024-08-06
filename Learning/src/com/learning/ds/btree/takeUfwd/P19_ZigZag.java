package com.learning.ds.btree.takeUfwd;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.Stack;

public class P19_ZigZag {
    public static void main(String[] args) {
        TreeNode<Integer> root = BinaryTree.create();
        traverse(root);
    }

    private static void traverse(TreeNode<Integer> node) {
        Stack<TreeNode<Integer>> lStack = new Stack<>();
        Stack<TreeNode<Integer>> rStack = new Stack<>();
        boolean flag = true;
        lStack.push(node);

        while (!lStack.isEmpty() || !rStack.isEmpty()) {
            if (flag) {
                TreeNode<Integer> tempNode = lStack.pop();
                System.out.print(" " + tempNode.value);
                if (tempNode.left != null)
                    rStack.push(tempNode.left);
                if (tempNode.right != null)
                    rStack.push(tempNode.right);
                if(lStack.isEmpty())
                    flag = !flag;
            } else {
                TreeNode<Integer> tempNode = rStack.pop();
                System.out.print(" " + tempNode.value);
                if (tempNode.right != null)
                    lStack.push(tempNode.right);
                if (tempNode.left != null)
                    lStack.push(tempNode.left);
                if(rStack.isEmpty())
                    flag = !flag;
            }
        }
    }
}
