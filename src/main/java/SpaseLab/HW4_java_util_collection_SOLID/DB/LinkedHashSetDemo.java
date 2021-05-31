package SpaseLab.HW4_java_util_collection_SOLID.DB;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("mercury");
        lhs.add("venus");
        lhs.add("earth");
        lhs.add("mars");

        System.out.println("напечатаем стартовое множество");

        for (String elhs : lhs) {
            System.out.println(elhs);
        }

        System.out.println("множество пустое? -" + lhs.isEmpty());
        System.out.println("размер множества - " + lhs.size());
        lhs.remove(3);
        lhs.remove("mercury");
        System.out.println();
        System.out.println("напечатаем множество");

        for (String ehs : lhs) {
            System.out.println(ehs);
        }

        System.out.println(lhs);

    }
}
