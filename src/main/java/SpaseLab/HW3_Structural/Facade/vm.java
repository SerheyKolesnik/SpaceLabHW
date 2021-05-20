package SpaseLab.HW3_Structural.Facade;

class Key implements Car {
    public void start() {
        System.out.println("Вставить ключи");
    }

    public void stop() {
        System.out.println("Вытянуть ключи");
    }
}
