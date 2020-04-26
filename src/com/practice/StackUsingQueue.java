package com.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingQueue {

    private Deque<Integer> queue = new ArrayDeque<>();

    public void push(int e){
        queue.add(e);
    }

    public int pop(){
        if(queue.isEmpty()){
            return -1;
        }
        for(int i = 1 ; i < queue.size(); i++){
            int val = queue.remove();
            queue.add(val);
        }
        return queue.remove();
    }
}
