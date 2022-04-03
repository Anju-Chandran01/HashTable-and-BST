package com.bridgelabz.bst;

public class BST {
    public int count=0;

    // node that defines bst
    static class Node {
        int key;
        Node left, right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    // inserting node
    void insert(int key) {
        root = insertRecursive(key, root);
    }

    Node insertRecursive(int key, Node root) {
        // if empty,insert as root
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
        //for displaying count
        System.out.println("\nCount of added element into tree is "+count);
    }

    void inorderRecursive(Node root) {
        if (root != null) {
            count++;
            inorderRecursive(root.left); //going through left node
            System.out.print(root.key + " "); //going through root node
            inorderRecursive(root.right); //going through right node
        }
    }
}