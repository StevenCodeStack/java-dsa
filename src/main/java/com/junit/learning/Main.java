package com.junit.learning;

import com.junit.learning.DataStructure.LinkedList.LinkedList;
import com.junit.learning.DataStructure.LinkedList.ListNode;
import com.junit.learning.DataStructure.Stack.Stack;
import com.junit.learning.DataStructure.Tree.Tree;
import com.junit.learning.DataStructure.Tree.TreeNode;

public class Main {
    public static void main(String[] args) {
//        int[] list = {5,9,2,6,1,9,0,5,3,7,5,8,3,12,35,578,354,23};

//        LinkedList list = new LinkedList();
//        ListNode listNode1 = new ListNode(1);
//        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(5);
//
//        list.insert(listNode5);
//        list.insert(listNode4);
//        list.insert(listNode3);
//        list.insert(listNode2);
//        list.insert(listNode1);
//
//        list.show();
//        list.mergeSort();
//        System.out.println();
//        list.show();

//        Stack stack = new Stack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.pop();
//        stack.show();

        Tree tree = new Tree();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        tree.insert(node4);
        tree.insert(node5);
        tree.insert(node3);
        tree.insert(node8);
        tree.insert(node2);
        tree.insert(node1);
        tree.insert(node6);
        tree.insert(node7);

        tree.show();
    }
}
