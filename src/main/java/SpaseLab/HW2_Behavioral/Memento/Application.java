package SpaseLab.HW2_Behavioral.Memento;

public class Application {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretacer caretacer = new Caretacer();

        originator.setState("on");
        System.out.printf("state is %s \n", originator.getState());
        caretacer.setMemento(originator.saveState());
        originator.setState("of");
        System.out.printf("state is %s \n", originator.getState());
        originator.restoreState(caretacer.getMemento());
        System.out.printf("state is %s \n", originator.getState());
        originator.setState("of");

        originator.restoreState(caretacer.getMemento());
        System.out.printf("state is %s \n", originator.getState());
    }
}
