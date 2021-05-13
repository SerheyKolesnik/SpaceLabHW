package SpaseLab.HW2_Behavioral.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(DownloadLinuxStrategy downloadLinuxStrategy) {
    }

    public void downLoad(String file) {
        strategy.download(file);
    }

}
