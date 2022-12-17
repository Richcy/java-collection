package queueCollection;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainPriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Richcy");
        queue.offer("Dian");
        queue.offer("Sukma");
        System.out.println("Initial Priority Queue Size: "+ queue.size());

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println("After Queue Priority Size: "+ queue.size());
    }

}
