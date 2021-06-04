package SpaseLab.HW4_java_util_collection_SOLID.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> hm = createHashMap();
        for (String ehm : hm.keySet()) {
            System.out.println(ehm + " volue: " + hm.get(ehm));
        }
        System.out.println(hm);
        System.out.println();

        System.out.println("02 коллекция содержит '000128' " + hm.containsKey("000128"));
        System.out.println("03 коллекция содержит 'CEM I 42.5' " + hm.containsValue("CEM I 42.5"));
        System.out.println("04 " + hm.entrySet());

        HashMap<String, String> testHM = createHashMap();
        System.out.println("05 коллекция соответствует другой " + hm.equals(testHM));
        System.out.println("06 коллекция пустая? " + hm.isEmpty());
        System.out.println("07 значение '000124' " + hm.get("000124"));

        System.out.println("08 значение '000129' если нет писать 'отсутствует': "
                + hm.getOrDefault("000129", "отсутствует"));
        System.out.println("09 добавим новый элемент " + hm.put("000124", "cem turkey 500"));

        System.out.println("10 добавим новый если такой отсутствует "
                + hm.putIfAbsent("000122", "cem turkey 400"));
        System.out.println(hm);
        System.out.println();

        System.out.println("11 набор всех ключей " + hm.keySet());
        System.out.println("12 набор всех значений " + hm.values());

        HashMap<String, String> addingHm = new HashMap<>();
        addingHm.putIfAbsent("000201", "else CEM");
        addingHm.putIfAbsent("000202", "Germany CEM 500");
        hm.putAll(addingHm);

        System.out.println("13 добавим другую коллекцию " + hm);
        System.out.println("14 удаляем '000123' " + hm);
        System.out.println("15 размер массива " + hm.size());

        hm.clear();
    }

    public static HashMap<String, String> createHashMap() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("000128", "CEM I 42.5");
        hm.put("000124", "CEM II A-S 32.5");
        hm.put("000122", "CEM II B-S 32.5");
        hm.put("000123", "CEM III A-S 32.5");
        return hm;
    }
}
