package collectionsClass;

import java.util.Queue;

public class MainAbstractCollection {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();
        queue.offer("Richcy");
        queue.offer("Dian");
        queue.offer("Sukma");

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
