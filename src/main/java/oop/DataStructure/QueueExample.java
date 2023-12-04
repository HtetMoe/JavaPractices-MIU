package oop.DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //add(enqueue) elements into queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        //dequeue elements from queue
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
