package SpaseLab.HW2_Behavioral.ChainOfRespons_worked;

public class StdoutLogger extends Logger {

    public StdoutLogger(int mask) {
        this.mask = mask;
    }

    protected void writeMessage(String msg) {
        System.out.println("Запис до stdout: " + msg);
    }
}
