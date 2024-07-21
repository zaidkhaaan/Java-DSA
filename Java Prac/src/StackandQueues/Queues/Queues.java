package StackandQueues.Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {


        // queues (FIFO)

        /*
        Enqueue ---> Add
        Dequeue ---> remove
        peek
         */

        // queues syntax

        Queue<Integer> que =new ArrayDeque<>();
        que.add(10);
        System.out.println(que);
        que.add(20);
        System.out.println(que);
        que.add(30);
        System.out.println(que);
        que.add(40);
        System.out.println(que);
        que.add(50);
        System.out.println(que);

        System.out.println(que);


        que.remove();
        System.out.println(que);
        que.remove();
        System.out.println(que);
        que.remove();
        System.out.println(que);
        que.remove();
        System.out.println(que);
    }
}
