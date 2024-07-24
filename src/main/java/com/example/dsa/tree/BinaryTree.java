package com.example.dsa.tree;

public class BinaryTree {
    Node root;
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    Node insertNode(Node node, int data) {
        if(root == null) {
            root = new Node(data);
            node = root;
        } else {
            if(data < root.data) node = insertNode(node.left, data);
            else node = insertNode(node.right, data);
        }
        return node;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(binaryTree.root, 1);
        binaryTree.insertNode(binaryTree.root, 2);
        binaryTree.insertNode(binaryTree.root, 3);
        binaryTree.insertNode(binaryTree.root, 4);
        binaryTree.insertNode(binaryTree.root, 5);
    }
}
