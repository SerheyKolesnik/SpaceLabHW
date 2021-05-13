package SpaseLab.HW2_Behavioral.Strategy;

public class DounloadWindowsStrategy implements Strategy {

    public void download(String file) {
        System.out.println("Windows download: " + file);
    }
}
