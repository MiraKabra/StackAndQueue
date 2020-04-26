package com.practice;

import java.util.Stack;

public class QueueUsingTwoStacks {

    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();

    public void enqueue(int e){
        A.push(e);
    }

    public int dequeue(){
        if (B.empty() && A.empty()){
            return -1;
        }
        if(!B.empty()){
            return B.pop();
        }
        while (!A.empty()){
            B.push(A.pop());
        }
        return B.pop();
    }
}
