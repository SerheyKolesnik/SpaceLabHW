package SpaseLab.HW4_java_util_collection_SOLID.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = createLinkedHashMap();
        System.out.println(lhm.entrySet());
        lhm.put("000201", "CEM Turkish 500");
        System.out.println("Добавили новый элемент 000201 ");
        System.out.println("Empty? " + lhm.isEmpty());
        System.out.println("получить значение '000201' " + lhm.get("000201"));
        System.out.println("Список ключей " + lhm.keySet());
        System.out.println("Список значений " + lhm.values());
        lhm.remove("000201");
        System.out.println("Состояние коллекции: " + lhm);
        System.out.println("Размер коллекции: " + lhm.size());

    }

    public static LinkedHashMap<String, String> createLinkedHashMap() {
        LinkedHashMap<String, String> hm = new LinkedHashMap<>();
        hm.put("000128", "CEM I 42.5");
        hm.put("000124", "CEM II A-S 32.5");
        hm.put("000122", "CEM II B-S 32.5");
        hm.put("000123", "CEM III A-S 32.5");
        return hm;
    }
}
