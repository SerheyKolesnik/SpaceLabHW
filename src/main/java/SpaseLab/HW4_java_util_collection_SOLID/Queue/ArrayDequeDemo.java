package SpaseLab.HW4_java_util_collection_SOLID.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.add("ask1");
        ad.add("ask2");
        ad.add("ask3");
        ad.add("ask4");
        System.out.println(ad);

        ad.addFirst("ask6");
        System.out.println("добавим элемент в голову " + ad);
        ad.addLast("ask8");
        System.out.println("добавим элемент в хвост " + ad);

        System.out.println("Первый элемент get -" + ad.getFirst());
        System.out.println("последний элемент get -" + ad.getLast());
        System.out.println();

        System.out.println("добавить элемент в голову offer -" + ad.offerFirst("ask10"));
        System.out.println("добавить элемент в хвост offer -" + ad.offerLast("ask11"));
        System.out.println("очередь теперь такая - " + ad);
        System.out.println("---------------");

        System.out.println("метод peek");
        System.out.println("первый элемент -" + ad.peekFirst());
        System.out.println("последний элемент -" + ad.peekLast());
        System.out.println("очередь теперь такая - " + ad);
        System.out.println("---------------");

        System.out.println("метод poll");
        System.out.println("первый элемент -" + ad.pollFirst());
        System.out.println("последний элемент -" + ad.pollLast());
        System.out.println("очередь теперь такая - " + ad);
        System.out.println("---------------");

        System.out.println("метод pop");
        System.out.println("первый элемент -" + ad.pop());
        System.out.println("очередь теперь такая - " + ad);
        System.out.println("---------------");

        System.out.println("метод push ничего не возвращает");
        System.out.println("добавляет элемент в голову");
        ad.push("ask13");
        System.out.println("очередь теперь такая - " + ad);
        System.out.println("---------------");
        System.out.println("метод removeFirstOccurrence");
        System.out.println("удаляет первый экземпляр 'ask2' из очереди -" + ad.removeFirstOccurrence("ask2"));
        System.out.println("очередь теперь такая - " + ad);
        System.out.println("---------------");
        System.out.println("метод removeLastOccurence");
        System.out.println("удаляет последний экземпляр 'ask3' из очереди -" + ad.removeLastOccurrence("ask3"));
        System.out.println("очередь теперь такая - " + ad);
        System.out.println("---------------");

        System.out.println("метод remove");
        System.out.println("забираем первый элемент -" + ad.removeFirst());
        System.out.println("забираем последний элемент -" + ad.removeLast());
        System.out.println("очередь теперь такая - " + ad);
        System.out.println("---------------");
    }
}
