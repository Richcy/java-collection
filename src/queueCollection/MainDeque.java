package queueCollection;

import java.util.Deque;
import java.util.LinkedList;

public class MainDeque {
    public static void main(String[] args) {
        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Richcy");
        queue.offerLast("Dian");
        queue.offerLast("Sukma");
        System.out.println("Initial Deque Size: "+ queue.size());

        for (var item = queue.pollLast(); item != null; item = queue.pollLast()){
            System.out.println(item);
        }

        System.out.println("After Deque Size: "+ queue.size());
    }
}
