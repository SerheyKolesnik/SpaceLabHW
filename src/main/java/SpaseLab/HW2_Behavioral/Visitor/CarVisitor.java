package SpaseLab.HW2_Behavioral.Visitor;

public class CarVisitor implements Visitor {

    public void visit(SportCar computer) {
        print("Car");
    }

    public void visit(Engine engine) {
        print("Engine");
    }

    public void visit(Whell whell) {
        print("Whell");
    }

    private void print(String string) {
        System.out.println(string);
    }
}
