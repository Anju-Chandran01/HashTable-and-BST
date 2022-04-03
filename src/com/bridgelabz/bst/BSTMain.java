package com.bridgelabz.bst;

public class BSTMain {
    public static void main(String[] args) {

        BST obj=new BST();

        //inserting 1st UC1
        obj.insert(56);
        obj.insert(30);
        obj.insert(70);

        // inserting UC2
        obj.insert(22);
        obj.insert(40);
        obj.insert(11);
        obj.insert(16);
        obj.insert(3);
        obj.insert(70);
        obj.insert(95);
        obj.insert(60);
        obj.insert(65);
        obj.insert(63);
        obj.insert(67);

        //displaying
        System.out.println("Data in the format of left-root-right");
        obj.inorder();
    }
}
