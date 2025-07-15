package com.junit.learning.DataStructure.LinkedList;

public class LinkedList {
    ListNode head;
    
    public void insert(ListNode listNode){
        if(head == null) {
            head = listNode;
            return;
        }
        
        ListNode n = head;
        while(n.next != null) {
            n = n.next;
        }
        n.next = listNode;
    }
    
    public void insertAt(int index, ListNode listNode) {

        if(index == 0) {
            listNode.next = head;
            head = listNode;
            return;
        }
        if(head == null) {
            head = listNode;
            return;
        }
        ListNode n = head;
        int step = 0;
        while(step < index - 1 && n.next != null){
            n.next = listNode;
            step++;
        }
        if(n.next == null) {
            n.next = listNode;
        } else {
            ListNode temp = n.next;
            n.next = listNode;
            listNode.next = temp;
        }
    }

    public void updateAt(int index, ListNode listNode){
        if(head == null) {
            head = listNode;
            return;
        }

        ListNode n = head;
        int step = 0;
        while(step < index - 1 && n != null) {
            if(n.next == null) {
                System.out.println("No Node at index " + index);
                return;
            } else {
                n = n.next;
            }
                step++;
        }


        if(n.next == null) {
            System.out.println("No Node at index " + index);
        } else {
            ListNode temp = n.next.next;
            n.next = listNode;
            listNode.next = temp;
        }

    }

    public void removeAt(int index){
        if(head == null) {
            System.out.println("Head is null");
            return;
        }

        ListNode n = head;
        int step = 0;
        while(step < index - 1 && n != null) {
            if(n.next != null) {
                n = n.next;
                step++;
            }else {
                System.out.println("No data at index " + index);
                return;
            }
        }

        if(n.next == null) {
            System.out.println("No data at index " + index);
        } else {
            n.next = n.next.next;
        }
    }

    public void delete(ListNode listNode) {
        if(head == null) {
            System.out.println("head is null");
            return;
        }
        if(head.data == listNode.data) {
            head = head.next;
            return;
        }

        ListNode n = head;
        while(n.next != null) {
            if(n.next.data == listNode.data) {
                n.next = n.next.next;
                return;
            }
            n = n.next;
        }
        System.out.println("No data found");
    }
    public void reverse(){
        if(head == null || head.next == null) {
            return;
        }
        ListNode p = null;
        ListNode c = head;
        while(c != null) {
            ListNode n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        head = p;
    }

    public ListNode getMid(){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public void show(){
        ListNode n = head;
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
