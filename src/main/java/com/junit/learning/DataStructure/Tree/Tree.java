package com.junit.learning.DataStructure.Tree;

public class Tree {
    TreeNode head = new TreeNode(4);

    public void insert(TreeNode node) {
        insertRec(head, node);
    }

    private TreeNode insertRec(TreeNode root, TreeNode node){
        if(root == null) return node;
        if(root.data > node.data) {
            root.left = insertRec(root.left, node);
        } else {
            root.right = insertRec(root.right, node);
        }
        return root;
    }

    public void show(){
        showRec(head);
    }

    private void showRec(TreeNode head){
        if(head == null) return;
        showRec(head.left);
        System.out.println(head.data);
        showRec(head.right);
    }
}
