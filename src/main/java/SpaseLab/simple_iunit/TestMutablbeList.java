package SpaseLab.simple_iunit;

import java.util.ArrayList;

public class TestMutablbeList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        final ArrayList<String> list2 = new ArrayList<String>();

        list.add("hello");
        list.add("world");

        list2.add("hello");
        list2.add("world");

        for (String item : list) {
            System.out.println("From variable ArrayList - " + item);
        }
        System.out.println("");
        for (String item : list2) {
            System.out.println("From final ArrayList - " + item);
        }
        final String str = "hello world";
        System.out.println(str.substring(6));

    }
}
