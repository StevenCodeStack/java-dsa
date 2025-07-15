package com.junit.learning;

import com.junit.learning.DataStructure.LinkedList.LinkedList;
import com.junit.learning.DataStructure.LinkedList.ListNode;

public class Main {
    public static void main(String[] args) {
//        int[] list = {5,9,2,6,1,9,0,5,3,7,5,8,3,12,35,578,354,23};

        LinkedList list = new LinkedList();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        list.insert(listNode5);
        list.insert(listNode4);
        list.insert(listNode3);
        list.insert(listNode2);
        list.insert(listNode1);

        list.show();
        list.mergeSort();
        System.out.println();
        list.show();
    }
}
