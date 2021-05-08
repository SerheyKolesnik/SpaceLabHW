package SpaseLab.HW2_Behavioral.Observer;

import java.util.List;

public class Director implements Observer {
    @Override
    public void event(List<String> strings) {
        System.out.println("Список студентов изменен: " + strings);
    }
}
