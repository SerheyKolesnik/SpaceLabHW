package SpaseLab.HW2.TemplateMethod;

abstract class Car {
    abstract void startEngine();

    abstract void endEngine();

    public final void start() {
        startEngine();
        endEngine();
    }
}
