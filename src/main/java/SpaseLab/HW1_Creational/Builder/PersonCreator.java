package SpaseLab.HW1_Creational.Builder;

public class PersonCreator {
    Builder builder = new Builder();

    public Person createPerson(String name, int age) {
        builder.create();
        builder.setName(name);
        builder.setAge(age);
        return builder.getPerson();
    }

}
