package com.noteam.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Fuxin
 * @since 2019/9/11 14:25
 */
public class MyStack {

    private Queue<Integer> first = new LinkedList<>();
    private Queue<Integer> second = new LinkedList<>();
    private int top;

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        first.add(x);
        top = x;
    }

    /** Removes the element from in front of queue and returns that element. */
    public Integer pop() {
        Integer pop = top;
        while (first.size() > 1) {
            top = first.remove();
            second.add(top);
        }
        first.remove();
        Queue<Integer> temp = first;
        first = second;
        second = temp;
        return pop;
    }

    /** Get the front element. */
    public Integer peek() {
        return top;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return first.isEmpty();
    }

}
