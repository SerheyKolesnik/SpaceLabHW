package SpaseLab.HW4_java_util_collection_SOLID.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        System.out.println("Начальный размер списка: " + al.size());
        al.add("A");
        al.add("C");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add("E");
        al.add(1, "a2");

        System.out.println("Текущий размер списка: " + al.size());
        System.out.println("Содержание списка " + al);

        //delete element
        al.remove("F");
        al.remove(2);
        System.out.println("Размер списка после удаления: " + al.size());
        System.out.println("Содержание списка после удаления " + al);

        List<String> masAdd = List.of("k", "o", "N");
        al.addAll(masAdd);
        System.out.println("Содержание списка после добавления другого списка " + al);

        System.out.println("Второй элемент списка: " + al.get(1));
        System.out.println("Номер элемента списка 'B': " + al.indexOf("B"));
        System.out.println("Последний элемент в списке со значением 'B': " + al.lastIndexOf("B"));
        System.out.println("Итератор " + al.listIterator());
        System.out.println("Присвоим 3му элементу значение '3e': " + al.set(3, "3e"));
        System.out.println("Содержание списка после обновления " + al);

        Collections.sort(al);
        System.out.println("Содержание списка после сортировки " + al);
        System.out.println("коллекция al содержит все элементы коллекции masAdd: " + al.containsAll(masAdd));
        System.out.println("---------------------------------------------");
        System.out.println("Содержание списка с 2 по 4 элемент " + al.subList(2, 4));
        System.out.println("содержание списка masAdd " + masAdd.toString());
        System.out.println("третий элемент коллекции соответствует 'E':" + al.get(3).equals("E"));
        System.out.println("Хеш коллекции " + al.hashCode());
        System.out.println("проверим заполнена ли коллекция masAdd " + masAdd.isEmpty());
        al.retainAll(masAdd);
        System.out.println("Из списка al удалили все элементы masAdd " + al);
        System.out.println("вызываем стрим al " + al.stream());
        System.out.println("al в массив ");

        for (Object eal : al.toArray()) {
            System.out.println(eal);
        }

        al.clear();
        System.out.println("Содержание списка al после очистки " + al);
    }
}
