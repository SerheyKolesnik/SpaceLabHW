package SpaseLab.HW2_Behavioral.Visitor;

public class Engine implements Car {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
