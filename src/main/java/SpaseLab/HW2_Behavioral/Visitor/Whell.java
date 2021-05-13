package SpaseLab.HW2_Behavioral.Visitor;

public class Whell implements Car {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
