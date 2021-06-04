package SpaseLab.HW4_java_util_collection_SOLID.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("D");
        System.out.println(ts);

        System.out.println("наименьший обьект множества: " + ts.ceiling("B"));
        System.out.println("наибольший обьект множества: " + ts.floor("B"));
        System.out.println("головная часть множества множества: " + ts.headSet("A", false));
        System.out.println("средняя часть множества множества: " + ts.subSet("B", "C)"));
        System.out.println("хвостовая часть множества множества: " + ts.tailSet("B", true));

        System.out.println("наибольший элемент " + ts.higher("A"));
        System.out.println("наибольший элемент " + ts.lower("A"));
        System.out.println("вернуть первый и убрать из множества " + ts.pollFirst());
        System.out.println("вернуть последний и убрать из множества " + ts.pollLast());

    }
}
