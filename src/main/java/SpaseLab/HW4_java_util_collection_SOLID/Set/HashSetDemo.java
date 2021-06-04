package SpaseLab.HW4_java_util_collection_SOLID.Set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("mercury");
        hs.add("venus");
        hs.add("earth");
        hs.add("mars");

        System.out.println("напечатаем стартовое множество");

        for (String ehs : hs) {
            System.out.println(ehs);
        }

        System.out.println("множество пустое? -" + hs.isEmpty());
        System.out.println("размер множества - " + hs.size());
        hs.remove(3);
        hs.remove("mercury");
        System.out.println();
        System.out.println("напечатаем множество");

        for (String ehs : hs) {
            System.out.println(ehs);
        }

        System.out.println(hs);

    }
}
