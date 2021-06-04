package SpaseLab.HW4_java_util_collection_SOLID;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableExample {
    public static void main(String args[]) {

        String strArray[] = {"seroga", "vitalik", "vova"};
        List<String> list = Arrays.asList(strArray);

        List<String> immutable = Collections.unmodifiableList(list);
        System.out.println(immutable);
        immutable.add("roma");
    }
}
