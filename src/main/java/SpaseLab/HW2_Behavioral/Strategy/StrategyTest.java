package SpaseLab.HW2_Behavioral.Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new DounloadWindowsStrategy());
        context.downLoad("file.txt");
        context = new Context(new DownloadLinuxStrategy());
        context.downLoad("file.txt");

    }
}
