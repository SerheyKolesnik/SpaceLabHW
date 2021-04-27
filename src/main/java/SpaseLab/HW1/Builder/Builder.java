package SpaseLab.HW1.Builder;

public class Builder {
    private Person person;

    public void create() {
        person = new Person();
    }

    public void setName(String name) {
        this.person.name = name;
    }

    public void SetAge(int age) {
        this.person.age = age;
    }

    public Person getPerson() {
        return this.person;
    }
}
