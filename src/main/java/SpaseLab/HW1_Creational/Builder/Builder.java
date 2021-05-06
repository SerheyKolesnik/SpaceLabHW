package SpaseLab.HW1_Creational.Builder;

public class Builder {
    private Person person;

    public void create() {
        person = new Person();
    }

    public void setName(String name) {
        this.person.name = name;
    }

    public void setAge(int age) {
        this.person.age = age;
    }

    public Person getPerson() {
        return this.person;
    }
}
