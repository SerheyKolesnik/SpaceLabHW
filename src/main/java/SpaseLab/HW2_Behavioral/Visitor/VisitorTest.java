package SpaseLab.HW2_Behavioral.Visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Car computer = new SportCar();
        computer.accept(new CarVisitor());
    }
}
