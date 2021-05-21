package SpaseLab.HW3_Structural.Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Decorator c = new DecoratorHello(
                new DecoratorComma(
                        new DecoratorSpace(
                                new MainComponent())));
        c.doOperation();
        c.newOperation();
    }

}
