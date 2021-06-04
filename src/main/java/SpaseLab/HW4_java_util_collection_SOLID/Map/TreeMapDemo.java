package SpaseLab.HW4_java_util_collection_SOLID.Map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> trm = createTreeMap();
        System.out.println(trm);

        System.out.println("01 Возврат элемента " + trm.ceilingEntry("000123"));
        System.out.println("02 Возврат элемента " + trm.floorEntry("000124"));
        System.out.println();

        System.out.println("03 Возврат элемента с наиб.ключом " + trm.higherEntry("000123"));
        System.out.println("04 Возврат элемента с наименюключем " + trm.lowerEntry("000125"));
        System.out.println();

        System.out.println("05 Первый элемент " + trm.firstEntry());
        System.out.println("06 Последний элемент " + trm.lastEntry());
        System.out.println();

        System.out.println("07 Возврат первого с удалением " + trm.pollFirstEntry());
        System.out.println("08 Возврат последнего с удалением " + trm.pollLastEntry());
        System.out.println("Все элементы " + trm + "\n");
        System.out.println();

        System.out.println("09 Возврат элемента с наимен.ключем " + trm.ceilingKey("000124"));
        System.out.println("10 Возврат элемента с наибол.ключем " + trm.floorKey("000125"));
        System.out.println();

        System.out.println("11 Возврат элемента с наимен.ключем " + trm.lowerKey("000128"));
        System.out.println("12 Возврат элемента с наибол.ключем " + trm.higherKey("000120"));
        System.out.println();

        System.out.println("13 Все ключи в обратном порядке Set " + trm.descendingKeySet());
        System.out.println("14 Все ключи в обратном порядке Map " + trm.descendingMap());
        System.out.println("15 Все ключи Set " + trm.navigableKeySet());
        System.out.println();

        trm.put("000201", "CEM II A-R 32.5");
        trm.put("000202", "CEM II A-S 42.5");
        System.out.println("Все элементы " + trm);

        System.out.println("16 Все элементы до " + trm.headMap("000201"));
        System.out.println("17 Все элементы после " + trm.tailMap("000125"));
        System.out.println("18 Все элементы между " + trm.subMap("000125", "000202"));

    }

    public static TreeMap<String, String> createTreeMap() {
        TreeMap<String, String> hm = new TreeMap<>();
        hm.put("000123", "CEM I 42.5");
        hm.put("000124", "CEM II A-S 32.5");
        hm.put("000125", "CEM II B-S 32.5");
        hm.put("000126", "CEM III A-S 32.5");
        return hm;
    }
}
