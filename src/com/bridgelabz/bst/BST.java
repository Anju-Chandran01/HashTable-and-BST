package com.bridgelabz.bst;

public class BST {

    Node root;

    // Node that defines Binary Search Tree
    class Node {
        int key;
        Node left, right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }

    BST() {
        root = null;
    }

    // inserting node
    void insert(int key) {
        root = insertRecursive(key, root);
    }

    Node insertRecursive(int key, Node root) {
        // if empty
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // inserting in left node
        if (key < root.key) {
            root.left = insertRecursive(key, root.left);
        }
        // inserting in right node
        else if (key > root.key) {
            root.right = insertRecursive(key, root.right);
        }
        return root;
    }

    // displaying in inorder
    void inorder() {
        inorderRecursive(root);
    }

    void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.key + " ");
            inorderRecursive(root.right);
        }
    }
}
