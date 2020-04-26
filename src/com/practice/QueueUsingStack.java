package com.practice;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> stack = new Stack<>();

    public void enqueue(int e){
        stack.push(e);
    }

    public int dequeue(){
        if(stack.empty()){
            return -1;
        }

        if(stack.size() != 1){
            int val = stack.pop();
            int x = dequeue();
            stack.push(val);
            return x;
        }
        else{return stack.pop();}

    }
}
