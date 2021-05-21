package SpaseLab.HW2_Behavioral.ChainOfRespons_worked;

public class StderrLogger extends Logger {

    public StderrLogger(int mask) {
        this.mask = mask;
    }

    protected void writeMessage(String msg) {
        System.err.println("Відправка до stderr: " + msg);
    }
}
