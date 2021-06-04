package SpaseLab.HW4_java_util_collection_SOLID;

import java.util.Comparator;

public class simpleComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}


