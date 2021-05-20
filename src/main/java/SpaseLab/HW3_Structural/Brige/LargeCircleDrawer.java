package SpaseLab.HW3_Structural.Brige;

public class LargeCircleDrawer implements Drawer {
    public static final double radiusMultiplaier = 10.0;

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Large circle center = " + x + "," + y + " radius = " + radius * radiusMultiplaier);
    }
}
