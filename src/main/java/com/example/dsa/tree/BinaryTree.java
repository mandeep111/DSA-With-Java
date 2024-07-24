package com.example.dsa.tree;

public class BinaryTree {
    Node insert(Node root, int data) {
        if(root == null) root = new Node(data);
        else {
            if(data <= root.getData()) root.setLeft(insert(root.getLeft(), data));
            else root.setRight(insert(root.getRight(), data));
        }
        return root;
    }

    public void inOrder(Node root) {
        if(root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData()+ ", ");
            inOrder(root.getRight());
        }
    }

    public void preOrder(Node root) {
        if(root != null) {
            System.out.print(root.getData()+ ", ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + ", ");
        }
    }

    public static void main(String[] args) {
        Node root = null;
        BinaryTree tree = new BinaryTree();
        root = tree.insert(root, 5);
        root = tree.insert(root, 4);
        root = tree.insert(root, 6);
        root = tree.insert(root, 7);
        tree.inOrder(root);
        System.out.println();
        tree.preOrder(root);
        System.out.println();
        tree.postOrder(root);
    }
}
