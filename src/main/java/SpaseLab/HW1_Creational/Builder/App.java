package SpaseLab.HW1_Creational.Builder;

import java.lang.String;

public class App {
    public static void main(String[] args) {
        PersonCreator pc = new PersonCreator();
        Person p1 = pc.createPerson("Вася", 10);
        Person p2 = pc.createPerson("Петя", 12);

        System.out.printf("%s = %s  %s\n", p1, p1.name, p1.age);
        System.out.printf("%s  = %s %s\n", p2, p2.name, p2.age);


    }
}
