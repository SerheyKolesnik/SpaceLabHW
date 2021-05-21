package SpaseLab.HW2_Behavioral.ChainOfRespons_worked;

public class ChainOfResponsibilityTest {

    public static void main(String[] args) {

        Logger l, l1, l2;
        l = new StdoutLogger(Logger.DEBUG);

        l1 = new EmailLogger(Logger.NOTICE);
        l.setNext(l1);

        l2 = new StderrLogger(Logger.ERR);
        l1.setNext(l2);

        l.message("Entering function y.", Logger.DEBUG);
        l.message("Step1 completed.", Logger.NOTICE);
        l.message("An error has occurred.", Logger.ERR);
    }
}
