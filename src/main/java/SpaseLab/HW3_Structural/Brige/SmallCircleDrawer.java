package SpaseLab.HW3_Structural.Brige;

public class SmallCircleDrawer implements Drawer {

    public static final double radiusMultiplaier = 0.25;

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius * radiusMultiplaier);
    }
}
