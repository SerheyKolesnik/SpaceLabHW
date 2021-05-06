package SpaseLab.HW1_Creational.Prototipe;

public class PrototypeAdd {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);
    }
}
