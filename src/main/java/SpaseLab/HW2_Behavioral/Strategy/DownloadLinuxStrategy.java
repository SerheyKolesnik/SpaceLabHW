package SpaseLab.HW2_Behavioral.Strategy;

public class DownloadLinuxStrategy implements Strategy {
    public void download(String file) {
        System.out.println("Linux download: " + file);
    }
}
