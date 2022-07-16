package org.javaadvanced;

import java.util.LinkedList;
import java.util.Queue;

public class C5UsingQueues {
    public static void main(String[] args) {
        linkedListQueue();
    }

    public static void linkedListQueue(){
        // A FIFO queue (First in First out)
        Queue<Integer> queue = new LinkedList<>();
        // add() inserts into queue (throws exception if no space exists - if capacity restricted)
        // offer() inserts into queue (returns false if no space exists - capacity restricted)
        queue.add(1);
        System.out.println(queue);
        queue.offer(2);
        System.out.println(queue);
        queue.add(3);
        System.out.println(queue);
        queue.offer(4);

        // element() retrieves but does not remove the head of the queue (throws exception if queue empty)
        // peek() retrieves but does not remove the head of the queue (returns null if queue is empty)
        System.out.println(queue.element());
        System.out.println(queue.peek());
    }
}
