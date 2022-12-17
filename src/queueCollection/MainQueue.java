package queueCollection;

import java.util.*;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(10);
        queue.offer("Richcy");
        queue.offer("Dian");
        queue.offer("Sukma");
        System.out.println("Initial Queue Size: "+ queue.size());

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println("After Queue Size: "+ queue.size());
    }
}
