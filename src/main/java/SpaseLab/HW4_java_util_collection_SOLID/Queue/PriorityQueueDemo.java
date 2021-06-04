package SpaseLab.HW4_java_util_collection_SOLID.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("task1");
        pq.add("task2");
        pq.add("task3");
        pq.add("task4");
        pq.add("task5");

        System.out.println(pq);
        System.out.println("элемент из головы очереди " + pq.element());
        System.out.println("введем элемент в очередь " + pq.offer("task7"));
        System.out.println(pq);
        System.out.println("возьмем элемент из очереди peek " + pq.peek());
        System.out.println(pq);
        System.out.println("забираем элемент из головы remove " + pq.remove());
        System.out.println(pq);
        System.out.println("забираем элемент из головы poll " + pq.poll());
        System.out.println(pq);
    }
}
