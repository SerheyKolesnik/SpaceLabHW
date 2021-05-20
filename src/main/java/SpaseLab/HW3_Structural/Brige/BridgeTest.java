package SpaseLab.HW3_Structural.Brige;

import SpaseLab.HW3_Structural.Brige.Circle;
import SpaseLab.HW3_Structural.Brige.LargeCircleDrawer;
import SpaseLab.HW3_Structural.Brige.Shape;
import SpaseLab.HW3_Structural.Brige.SmallCircleDrawer;

public class BridgeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, 10, 10, new LargeCircleDrawer()),
                new Circle(20, 30, 100, new SmallCircleDrawer())};

        for (Shape next : shapes) {
            next.draw();
        }
    }

}
