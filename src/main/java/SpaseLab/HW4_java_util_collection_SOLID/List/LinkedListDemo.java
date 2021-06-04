package SpaseLab.HW4_java_util_collection_SOLID.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = createLinkedList();
        System.out.println("создан список:");
        printList(ll);
        System.out.println();
        System.out.println("добавим элементы:");
        ll.add(2, "masha");
        ll.addLast("olia");
        ll.addFirst("fedia");
        ll.set(1, "noname");
        printList(ll);

        System.out.println();
        ll.offerFirst("katia");
        ll.offerLast("sonia");
        printList(ll);

        System.out.println("получить первый элемент метод get " + ll.getFirst());
        System.out.println("получить последний элемент метод get " + ll.getLast());
        System.out.println();
        printList(ll);

        System.out.println();
        System.out.println("получить первый элемент метод peek " + ll.peekFirst());
        System.out.println("получить последний элемент  метод peek " + ll.peekLast());
        printList(ll);

        System.out.println();
        System.out.println("удалить первый элемент метод remove " + ll.removeFirst());
        System.out.println("удалить последний элемент метод remove " + ll.removeLast());
        printList(ll);

        System.out.println();
        System.out.println("удалить первый элемент метод poll " + ll.pollFirst());
        System.out.println("удалить последний элемент метод poll " + ll.pollLast());
        printList(ll);

        ll.clear();
        printList(ll);

    }

    private static LinkedList<String> createLinkedList() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("kolia");
        ll.add("anna");
        ll.add("petia");
        ll.add("vacia");
        ll.add("ura");
        return ll;
    }

    private static void printList(List<?> ll) {
        for (Object ell : ll) System.out.println(ell);
    }

}
