package com.practice;

public class Main {

    public static void main(String[] args) {

        // Check stack implementation using queue
        StackUsingQueue stack = new StackUsingQueue();
        System.out.println(stack.pop());
        stack.push(1); stack.push(2);
        stack.push(3); stack.push(4);
        System.out.println(stack.pop());
        stack.push(5);
        System.out.println(stack.pop());

        // Check queue implementation using stack
        QueueUsingStack queue = new QueueUsingStack();
        System.out.println(queue.dequeue());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        System.out.println(queue.dequeue());

        //Check queue implementation using two stacks
        QueueUsingTwoStacks queueAdv = new QueueUsingTwoStacks();
        System.out.println(queueAdv.dequeue());
        queueAdv.enqueue(1);
        queueAdv.enqueue(2);
        queueAdv.enqueue(3);
        System.out.println(queueAdv.dequeue());
        queueAdv.enqueue(4);
        System.out.println(queueAdv.dequeue());
    }
}
