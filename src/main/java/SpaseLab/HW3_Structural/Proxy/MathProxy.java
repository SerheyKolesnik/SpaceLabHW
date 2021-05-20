package SpaseLab.HW3_Structural.Proxy;

public class MathProxy implements Imath {
    private Math math;

    private void LazyInitMath() {
        if (math == null) {
            math = new Math();
        }
    }

    @Override
    public double add(double x, double y) {
        LazyInitMath();
        return math.add(x, y);
    }

    @Override
    public double sub(double x, double y) {
        LazyInitMath();
        return math.sub(x, y);
    }

    @Override
    public double mul(double x, double y) {
        LazyInitMath();
        return math.mul(x, y);
    }

    @Override
    public double div(double x, double y) {
        LazyInitMath();
        return math.div(x, y);
    }
}
