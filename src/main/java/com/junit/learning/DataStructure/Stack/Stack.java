package com.junit.learning.DataStructure.Stack;

import java.util.Arrays;

public class Stack {
    public int[] stack = new int[5];
    public int capacity = 5;
    public int top = 0;

    public void push(int data) {
        if(size() >= capacity) {
            expand();
        }
        if(stack.length > top) {
            stack[top] = data;
            top++;
        }
    }

    public int pop(){
        if(size() == 0) {
            System.out.println("No data in Stack");
            return -1;
        }
        int data = stack[top - 1];
        stack[top - 1] = 0;
        top--;
        shrink();
        return data;
    }

    public int peak(){
        if(!isEmpty()){
            return stack[top-1];
        } else {
            return -1;
        }
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int size(){
        return top;
    }

    public void expand(){
        stack = Arrays.copyOf(stack, capacity*2);
        capacity *= 2;
    }

    public void shrink(){
        if(capacity > 5 && size() <= capacity / 2) {
            stack = Arrays.copyOf(stack, capacity/2);
            capacity /= 2;
        }
    }

    public void show(){
        for(int data : stack) {
            System.out.print(data + " ");
        }
    }
}
