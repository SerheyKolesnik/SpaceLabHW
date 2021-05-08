package SpaseLab.HW2_Behavioral.Observer;

public class ObserverTest {
    public static void main(String[] args) {
        University university = new University();
        Director director = new Director();
        university.addStudent("Vasiliy");
        university.addStudent("Anna");
        university.addObserver(director);
        university.removeStudent("Vasiliy");
    }
}
