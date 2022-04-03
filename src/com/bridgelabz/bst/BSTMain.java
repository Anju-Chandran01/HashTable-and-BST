package com.bridgelabz.bst;

public class BSTMain {
    public static void main(String[] args) {

        BST obj=new BST();

        //inserting 1st UC
        obj.insert(56);
        obj.insert(30);
        obj.insert(70);

        //displaying
        System.out.println("Data in the format of left-root-right");
        obj.inorder();
    }
}
