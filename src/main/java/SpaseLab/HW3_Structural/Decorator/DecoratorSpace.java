package SpaseLab.HW3_Structural.Decorator;

public class DecoratorSpace extends Decorator {
    public DecoratorSpace(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation");
    }
}
