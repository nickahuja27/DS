package com.learning.ds.btree.takeUfwd;

import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://www.youtube.com/watch?v=dj0q8D_hPdo
public class P31_BurningTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = create();
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        burningTree(root, 2, queue);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode<Integer> current = queue.poll();
                System.out.print(current.value + " ");
                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }
            System.out.println();
        }
    }

    private static boolean burningTree(TreeNode<Integer> node, int targetNum, Queue<TreeNode<Integer>> queue) {
        return false;
    }

    public static TreeNode<Integer> create() {
        TreeNode<Integer> root = new TreeNode<Integer>(3);
        root.left = new TreeNode<Integer>(5);
        root.left.left = new TreeNode<Integer>(6);
        root.left.right = new TreeNode<Integer>(2);
        root.left.right.left = new TreeNode<Integer>(7);
        root.left.right.right = new TreeNode<Integer>(4);

        root.right = new TreeNode<Integer>(1);
        root.right.left = new TreeNode<Integer>(0);
        root.right.right = new TreeNode<Integer>(8);
        root.right.right.right = new TreeNode<Integer>(10);

        return root;
    }
}
