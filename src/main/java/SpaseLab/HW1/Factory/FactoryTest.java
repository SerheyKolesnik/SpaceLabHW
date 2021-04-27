package SpaseLab.HW1.Factory;

public class FactoryTest {

    public static void main(String[] args) {
        String win = "Linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(win);
        os.getOS();
    }
}
