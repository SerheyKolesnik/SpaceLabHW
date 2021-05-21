package SpaseLab.HW2_Behavioral.ChainOfRespons_worked;

public class EmailLogger extends Logger {

    public EmailLogger(int mask) {
        this.mask = mask;
    }

    protected void writeMessage(String msg) {
        System.out.println("Відправка через email: " + msg);
    }

}
