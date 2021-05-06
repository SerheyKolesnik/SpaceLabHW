package SpaseLab.HW1_Creational.Factory;

public class Factory {
    public OS getCurrentOS(String inputos) {
        OS os = null;
        if (inputos.equals("Windows")) {
            os = new WindowsOS();
        } else if (inputos.equals("Linux")) {
            os = new LinuxOS();
        } else if (inputos.equals("mac")) {
            os = new MacOS();
        }
        return os;
    }
}
