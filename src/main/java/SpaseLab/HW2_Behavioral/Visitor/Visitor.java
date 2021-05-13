package SpaseLab.HW2_Behavioral.Visitor;

public interface Visitor {
    void visit(SportCar sportCar);

    void visit(Engine engine);

    void visit(Whell whell);
}
